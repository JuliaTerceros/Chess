public class Queen extends Piece{
    public Queen(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    @Override
    public boolean canMove(Move move, Board board) {
        return board.isThereClearPath(move) && (move.currentY == move.nextY)&&(move.currentX != move.nextX) ||
                (move.currentX == move.nextX)&&(move.currentY != move.nextY) ||
                (Math.abs(move.nextX - move.currentX)==Math.abs(move.nextY - move.currentY));
    }
}
