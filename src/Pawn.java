public class Pawn extends Piece {
    public Pawn(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    @Override
    public boolean canMove(Move move, Board board) {
        ChessColor currentColor = move.color;

        //Check Direction of the Movement
        if (!((currentColor == ChessColor.White && move.nextX < move.currentX)
                || (currentColor == ChessColor.Black && move.nextX > move.currentX))) {
            return false;
        }

        //This is moving diagonal (only applies when capturing other piece)
        int differenceRow = Math.abs(move.currentX - move.nextX);
        int differenceCol = Math.abs(move.currentY - move.nextY);


        if (differenceRow == differenceCol){
            if (differenceCol > 1) {
                return false;
            } else if (differenceCol == 1) {
                if (board.isEmptyPosition(move.nextX, move.nextY)){
                    return false;
                }
                return board.isOpponentPieceThere(move.nextX, move.nextY, currentColor);
            }
        }




        //This is moving vertical
        if (!board.isEmptyPosition(move.nextX, move.nextY)){
            return false;
        }

        if (move.color == ChessColor.Black && move.nextY == move.currentY && (move.nextX-move.currentX) == 1 ||
        move.color == ChessColor.White && move.nextY == move.currentY && (move.nextX-move.currentX) == -1 ) {
            return true;

        } else if ( board.isThereClearPath(move) &&
                (move.color == ChessColor.Black && (move.nextY == move.currentY) && move.currentX == 1
                        && (move.nextX-move.currentX) == 2 ||
                move.color == ChessColor.White && (move.nextY == move.currentY) && move.currentX == 6 &&
                        (move.nextX-move.currentX)== -2 )) {
            return true;

        }
        return false;
    }



}
