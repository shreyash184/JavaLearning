public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentTurn;
    private GameStatus status;

    public Game(Player p1, Player p2){
        board = new Board();
        this.player1 = p1;
        this.player2 = p2;
        this.status = GameStatus.ACTIVE;
        if(p1.isWhiteSide()){
            this.currentTurn = p1;
        }else{
            this.currentTurn = p2;
        }
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setStatus(GameStatus status){
        this.status = status;
    }

    public Player getCurrentTurn() {
        return this.currentTurn;
    }

    public GameStatus getStatus(){
        return this.status;
    }



    public boolean playerMove(Player player, Position start1, Position end1) throws Exception {
        Spot start = board.getSpot(start1);
        Spot end = board.getSpot(end1);
        Move move =  new Move(player, start, end);
        return this.makeMove(move, player);
    }

    private boolean makeMove(Move move, Player player){
        Piece sourcePiece = move.getStart().getPiece();

        if(sourcePiece == null){
            System.out.println("Source piece is null");
            return false;
        }

        // valid player
        if(player != currentTurn){
            System.out.println("Invalid player is playing, it's not your turn");
            return false;
        }

        if(sourcePiece.isWhite() != player.isWhiteSide()){
            System.out.println("It's your turn, but you are playing opponent's element");
            return false;
        }

        // valid move
        if(!sourcePiece.move(move.getStart(), move.getEnd())){
            System.out.println("This move is not valid");
            return false;
        }

        // kill ?
        Piece destPiece = move.getEnd().getPiece();
        if(destPiece != null){
            destPiece.setKilled(true);
        }

        // move piece from the stat box to end box
        move.getEnd().setPiece(move.getStart().getPiece());
        move.getStart().setPiece(null);

        if(destPiece != null && destPiece instanceof King){
            if(player.isWhiteSide()){
                this.setStatus(GameStatus.WHITE_WIN);
            }else{
                this.setStatus(GameStatus.BLACK_WIN);
            }
        }

        // set the current turn to the other player
        if(this.currentTurn == player1){
            this.currentTurn = player2;
        }else{
            this.currentTurn = player1;
        }
        return true;
    }
}
