public class Knight extends Piece{
    public Knight(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    @Override
    public boolean canMove(Move move, Board board) {
        if ((Math.abs(move.nextY - move.currentY) == 2 && Math.abs(move.nextX - move.currentX) == 1) ||
                Math.abs(move.nextY - move.currentY) == 1 && Math.abs(move.nextX - move.currentX) == 2){
            return true;
        }
        return false;
    }


    //move in a 2 by 1 direction
    //jump over other unit doesn't have to be a clear 2 by 1
}
