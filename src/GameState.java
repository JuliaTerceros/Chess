public class GameState {
    public Players[] Players;
    public Board board;
    public Players currentPlayer;

    public GameState() {
        this.Players = new Players[2];
        this.Players[0] = new Players(ChessColor.Black,false);
        this.Players[1] = new Players(ChessColor.White, true);
        this.board = new Board();
        this.board.setUpBoard();
        this.currentPlayer = this.Players[1];
    }

    public void nextPlayer() {
        if (this.currentPlayer.equals(this.Players[0])) {
            this.currentPlayer = this.Players[1];
        } else {
            this.currentPlayer = this.Players[0];
        }
    }

}


