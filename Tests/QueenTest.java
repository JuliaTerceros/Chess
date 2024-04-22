import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QueenTest {
    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece queen = new Queen('\u2655',ChessColor.White, "queenW");
        board.placePiece(3,3,queen);

        assertTrue(queen.canMove(new Move(3,3,3,2,ChessColor.White), board));

    }

    @Test

}
