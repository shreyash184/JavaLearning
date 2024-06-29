import java.util.Queue;

public class Board {
    Spot[][] board = new Spot[8][8];

    public Board(){
        resetBoard();
    }

    public Spot getSpot(Position position) throws Exception {
        Integer xaxis = position.xaxis;
        Integer yaxis = position.yaxis;

        if(xaxis < 0 || xaxis > 7 || yaxis < 0 || yaxis > 7){
            throw new Exception("Index out of Bound");
        }
        return board[xaxis][yaxis];
    }

    public void resetBoard(){
        //First Players White Pawn initialized
        for(int j=0;j<8;j++){
            Position position = new Position(1, j);
            board[1][j] = new Spot(position, new Pawn(true));
        }

        //First Players other pieces initialization
        // White Rook initialization
        board[0][0] = new Spot(new Position(0, 0), new Rook(true));
        board[0][7] = new Spot(new Position(0, 7), new Rook(true));

        // White Knight initialization
        board[0][1] = new Spot(new Position(0, 1), new Knight(true));
        board[0][6] = new Spot(new Position(0, 6), new Knight(true));

        // White Bishab initialization
        board[0][2] = new Spot(new Position(0, 2), new Bishab(true));
        board[0][5] = new Spot(new Position(0, 5), new Bishab(true));

        // White King Inialization
        board[0][3] = new Spot(new Position(0, 3), new King(true));

        // White Queen Initialization
        board[0][4] = new Spot(new Position(0, 4), new Queen(true));

        //Second Players Pawn initialized
        for(int j=0;j<8;j++){
            Position position = new Position(6, j);
            board[6][j] = new Spot(position, new Pawn(false));
        }

        //Second Players other pieces initialization
        // Black Rook initialization
        board[7][0] = new Spot(new Position(0, 0), new Rook(false));
        board[7][7] = new Spot(new Position(0, 7), new Rook(false));

        // Black Knight initialization
        board[7][1] = new Spot(new Position(0, 1), new Knight(false));
        board[7][6] = new Spot(new Position(0, 6), new Knight(false));

        // Black Bishab initialization
        board[7][2] = new Spot(new Position(0, 2), new Bishab(false));
        board[7][5] = new Spot(new Position(0, 5), new Bishab(false));

        // Black King Inialization
        board[7][3] = new Spot(new Position(0, 3), new King(false));

        // black Queen Initialization
        board[7][4] = new Spot(new Position(0, 4), new Queen(false));


        //Initialize rest of Spot as null
        for(int i=2;i<6;i++){
            for(int j=0;j<8;j++){
                board[i][j] = new Spot(new Position(i, j), null);
            }
        }
    }
}
