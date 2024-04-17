import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KingTest {
    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece king = new King('\u2654',ChessColor.White, "kingW");
        board.placePiece(3,3,king);

        assertTrue(king.canMove(new Move(3,3,3,4,ChessColor.White), board));


    }
}
