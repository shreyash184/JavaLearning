import com.sun.tools.javac.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Board board;
    private Deque<Player> players;

    private static Game game;
    private Game(){
        board = new Board(3);
        players = new LinkedList<>();

        Player player1 = new Player("Goldman", new Piece(PieceType.X));
        Player player2 = new Player("UBS", new Piece(PieceType.O));

        players.add(player1);
        players.add(player2);
    }

    public static Game getGame(){
        if(game == null){
            game = new Game();
        }
        return game;
    }

    public void startGame(){
        boolean noWinner = true;

        while(noWinner){
            Player playerTurn = players.removeFirst();

            board.printBoard();

            List<Pair<Integer, Integer>> freeSpaces = board.getFreeCells();

            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("Player : " + playerTurn.getName() + " Enter row,column: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();;
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputCol = Integer.parseInt(values[1]);

            boolean placed = board.addPiece(inputRow, inputRow, playerTurn.getPiece());
            if(!placed){
                System.out.println("Incorrect posstion");
                players.addFirst(playerTurn);
                continue;
            }

            boolean winner = isWinner(inputRow, inputCol, playerTurn.getPiece().pieceType);
            if(winner){
                System.out.println(playerTurn + " is winner");
                return;
            }
        }

        System.out.println("Tie");
        return;
    }

    public boolean isWinner(int row, int col, PieceType pieceType){

        //Check rows

        //Check col

        // Check left Diagonal

        // Check right Diagonal

        return false;
    }
}
