public class King extends Piece{
    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean move(Spot start, Spot end) {
        return true;
    }
}
