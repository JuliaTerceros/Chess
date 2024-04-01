import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RookTest {
    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece rook = new Rook('\u2656',ChessColor.White, "rookQW");
        board.placePiece(3,3,rook);

        assertTrue(rook.canMove(new Move(3,3,3,2,ChessColor.White)));

    }
}
