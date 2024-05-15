public class Main {
    static GameState game = new GameState();

    public static void main(String[] args) {

        while (true) {
            game.board.displayBoard();
            System.out.println("The current player is: " + game.currentPlayer.color);
            Move turn = game.currentPlayer.getTurn();

            if (game.board.isEmptyPosition(turn.currentX, turn.currentY)
                    || game.board.isOpponentPieceThere(turn.currentX, turn.currentY,game.currentPlayer.color)) {
                System.out.println("Try again, the starting location need one of your piece");
                turn = game.currentPlayer.getTurn();
            }
            game.board.applyMove(turn);
            game.nextPlayer();
        }
    }
}



