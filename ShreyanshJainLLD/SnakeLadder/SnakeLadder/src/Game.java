import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Deque<Player> players;
    Dice dice;
    Player winner;

    private static volatile Game snakeLadderGame;

    private Game(){
        initializeGame();
    }

    public static Game getSnakeLadderGame(){
        if(snakeLadderGame == null){
            synchronized (Game.class){
                if(snakeLadderGame == null){
                    snakeLadderGame = new Game();
                }
            }
        }

        return snakeLadderGame;
    }

    private void initializeGame(){
        players = new LinkedList<>();
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers(){
        Player player1 = new Player("Shreyash", 0);
        Player player2 = new Player("Prat", 0);

        this.players.addFirst(player1);
        this.players.addFirst(player2);
    }


    public void startGame(){
        while(winner == null){
            //check whose turn is now
            Player playerTurn = findPlayerTurn();
            System.out.println(playerTurn.id + "'s turn and current position is: " + playerTurn.currentPosition);

            int getDiceNumber = dice.rollDice();

            // get ne position
            int playerNewPosition = playerTurn.currentPosition + getDiceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println(playerTurn.id + "'s New position is " + playerNewPosition);

            //Check for winning condition
            if(playerNewPosition >= (board.cells.length * board.cells.length) - 1){
                winner = playerTurn;
            }
        }

        System.out.println("WINNER is " + winner.id);
    }

    private Player findPlayerTurn(){
        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }

    private int jumpCheck(int playerNewPosition){
        if(playerNewPosition > (board.cells.length * board.cells.length) -1){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition){
            String jumpBy;
            if(cell.jump.start > cell.jump.end){
                jumpBy = "Snake";
            }else{
                jumpBy = "Ladder";
            }
            System.out.println("Jump done by : " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }
}
