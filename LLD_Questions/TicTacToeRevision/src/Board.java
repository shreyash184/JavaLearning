import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private Piece[][] board;


    public Board(int size){
        this.size = size;
        this.board = new Piece[size][size];
    }

    public boolean addPiece(int row, int col, Piece piece){
        if(board[row][col] == null){
            board[row][col] = piece;
        }
        return false;
    }

    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i=0; i<size; i++){
            for(int j=0;j<size; j++){
                if(board[i][j] == null){
                    Pair<Integer, Integer> freeCell = new Pair<>(i, j);
                    freeCells.add(freeCell);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] != null)
                    System.out.print(board[i][j].pieceType.name() + " ");
                else{
                    System.out.print(" _ ");
                }
            }
            System.out.println();
        }
    }
}
