public class Pawn extends Piece {
    public Pawn(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    @Override
    public boolean canMove(Move move) {
        if (move.color == ChessColor.Black && move.nextX == move.currentX && (move.nextY-move.currentY) == 1 ||
        move.color == ChessColor.White && move.nextX == move.currentX && (move.nextY-move.currentY)== -1 ) {
            return true;

        } else if (move.color == ChessColor.Black && (move.nextX == move.currentX) && move.currentX == 1 && (move.nextY-move.currentY) == 2 ||
                move.color == ChessColor.White && (move.nextX == move.currentX) && move.currentX == 6 && (move.nextY-move.currentY)== -2 ) {
            return true;

        }
        return false;
    }




    //if first turn, then can move 2 tiles forward
    //if not, then can move only 1 tile forward

    //First move for white pawn in row 6
    //move black pawn in row 1

}
