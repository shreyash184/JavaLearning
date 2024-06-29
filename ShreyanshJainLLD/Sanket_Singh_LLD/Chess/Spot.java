public class Spot {
    private Position position;
    private Piece piece;

    public Spot(Position position, Piece piece){
        this.position = position;
        this.piece = piece;
    }

    public Piece getPiece(){
        return this.piece;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }

    public Position getPosition(){
        return this.position;
    }

    public void setPosition(Position position){
        this.position = position;
    }
}
