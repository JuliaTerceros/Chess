import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PawnTest {
    // check if pawn move twice in their 1st move
    //check if pawn move only once after 1st turn
    // check if pawn take diagonally
    //check if pawn is promoted to a queen
    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece pawn  = new Pawn('\u2659', ChessColor.White, "pawnAW");
        board.placePiece(3,3,pawn);

        assertTrue(pawn.canMove(new Move(3,3,3,2,ChessColor.White)));
    }

}
