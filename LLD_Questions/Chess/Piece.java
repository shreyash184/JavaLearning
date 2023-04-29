public abstract class Piece {

    private boolean white = false;
    private boolean killed = false;

    public abstract boolean move(Spot start, Spot end);

    public Piece(boolean white){
        this.setWhite(white);
    }

    public boolean isWhite(){
        return this.white;
    }

    public void setWhite(boolean white){
        this.white = white;
    }

    public boolean isKilled(){
        return this.killed;
    }

    public void setKilled(boolean killed){
        this.killed = killed;
    }
}
