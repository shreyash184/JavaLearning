public class Knight extends Piece {
    public Knight(boolean white) {
        super(white);
    }

    @Override
    public boolean move(Spot start, Spot end) {
        return true;
    }
}
