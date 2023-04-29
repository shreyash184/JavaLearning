import java.util.Scanner;


/**
 * What is remaining ?
 *
 * Implement the move method for each piece
 * Format the code properly
 * Please make the class diagram to get the overview of the chess game.
 * Currently the structuring of the files is in one folder, make is all readable and in proper structure.
 */

public class Main {

    public static void displayBoard(Board board) throws Exception {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                String element = "";
                Piece piece = board.getSpot(new Position(i,j)).getPiece();
                if(piece instanceof King){
                    element = "K";
                }else if(piece instanceof Queen){
                    element = "Q";
                }else if(piece instanceof Knight){
                    element = "k";
                }else if(piece instanceof Rook){
                    element = "R";
                }else if(piece instanceof Bishab){
                    element = "B";
                }else if(piece instanceof Pawn){
                    element = "P";
                }else{
                    element = "_";
                }
                System.out.print(element+ "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Player shreyash = new HumanPlayer(true);
        Player shivansh = new ComputerPlayer(false);

        Game chess = new Game(shreyash, shivansh);


        System.out.println("The game is in " + chess.getStatus() + " mode");

        System.out.println("Current Turn is of " + chess.getCurrentTurn());

        displayBoard(chess.getBoard());

        Integer moveCount = 0;

        Scanner sc = new Scanner(System.in);
        while(chess.getStatus() == GameStatus.ACTIVE){
            System.out.println("Current Player is " + chess.getCurrentTurn());
            if(chess.getCurrentTurn().equals(shreyash)){
                System.out.print("Shreyash, tell me the position of the element you want to move : ");
                Integer startXaxis = sc.nextInt();
                Integer startYaxis = sc.nextInt();
                Position start = new Position(startXaxis, startYaxis);


                System.out.print("Shreyash, Please enter your move : ");
                Integer destXaxis = sc.nextInt();
                Integer destYaxis = sc.nextInt();
                Position dest = new Position(destXaxis, destYaxis);

                if(chess.getBoard().getSpot(start) == null){
                    System.out.println("null");
                }

                boolean moved = chess.playerMove(shreyash, start, dest);
                if(!moved) System.out.println("Invalid move");

                System.out.println("Shreyash, your element has moved successfully");
                displayBoard(chess.getBoard());
            }else{
                System.out.print("Shivansh, tell me the position of the element you want to move : ");
                Integer startXaxis = sc.nextInt();
                Integer startYaxis = sc.nextInt();
                Position start = new Position(startXaxis, startYaxis);


                System.out.print("Shivansh, Please enter your move : ");
                Integer destXaxis = sc.nextInt();
                Integer destYaxis = sc.nextInt();
                Position dest = new Position(destXaxis, destYaxis);

                boolean moved = chess.playerMove(shivansh, start, dest);
                if(!moved) System.out.println("Invalid Move");
                System.out.println("Shivansh, your element has moved successfully");
                displayBoard(chess.getBoard());
            }
        }
    }
}
