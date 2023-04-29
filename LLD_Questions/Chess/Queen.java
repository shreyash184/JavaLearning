public class Queen extends Piece {
    public Queen(boolean white) {
        super(white);
    }

    @Override
    public boolean move(Spot start, Spot end) {
        return true;
    }
}
