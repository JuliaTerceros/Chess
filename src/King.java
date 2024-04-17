public class King extends Piece{
    public King(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    @Override
    public boolean canMove(Move move, Board board) {
        return ((move.currentY == move.nextY) && (Math.abs(move.nextX - move.currentX) == 1) ||
                (move.currentX == move.nextX) && (Math.abs(move.nextY - move.currentY) == 1) ||
                (Math.abs(move.nextX - move.currentX) == 1) && (Math.abs(move.nextY - move.currentY) == 1));
    }

    //TO DO: Make king so that it cannot move to a place where it's in danger

    // can move an any direction once
    // can't move to a location that will put him in danger
}
