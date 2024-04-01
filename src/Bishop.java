public class Bishop extends Piece {

    public Bishop(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    @Override
    public boolean canMove(Move move) {
        if (Math.abs(move.nextX - move.currentX)==Math.abs(move.nextY - move.currentY)){
            return true;
        }
        return false;
    }

}
