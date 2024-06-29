public class Rook extends Piece {
    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean move(Spot start, Spot end) {
        return true;
    }
}
