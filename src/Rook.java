public class Rook extends Piece{

    public Rook(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    @Override
    public boolean canMove(Move move) {
        if ((move.currentY == move.nextY)&&(move.currentX != move.nextX) ||
                (move.currentX == move.nextX)&&(move.currentY != move.nextY)){
            return true;
        }
        return false;
    }

}

