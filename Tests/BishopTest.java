import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BishopTest {
    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece bishop = new Bishop('♝',ChessColor.Black, "bishopKB");
        board.placePiece(3,3,bishop);

        assertTrue(bishop.canMove(new Move(3,3,2,2,ChessColor.White)));

    }

}
