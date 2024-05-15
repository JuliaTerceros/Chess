public class King extends Piece {
    public King(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    @Override
    public boolean canMove(Move move, Board board) {
        if (board.getPiece(move.nextX, move.nextY) != null && !board.isOpponentPieceThere(move.nextX, move.nextY,
                board.getPiece(move.currentX, move.currentY).color)) {
            return false;
        }

        return ((move.currentY == move.nextY) && (Math.abs(move.nextX - move.currentX) == 1) ||
                (move.currentX == move.nextX) && (Math.abs(move.nextY - move.currentY) == 1) ||
                (Math.abs(move.nextX - move.currentX) == 1) && (Math.abs(move.nextY - move.currentY) == 1));
    }
}
