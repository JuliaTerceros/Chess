import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RookTest {
    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece rook = new Rook('\u2656',ChessColor.White, "rookQW");
        board.placePiece(3,3,rook);

        assertTrue(rook.canMove(new Move(3,3,3,2,ChessColor.White), board));

    }

    @Test
    public void canMoveFalse(){
        Board board = new Board();
        Piece pawn = new Pawn('♟', ChessColor.Black, "pawnAB");
        Piece rook = new Rook('\u2656',ChessColor.White, "rookQW");
        board.placePiece(0,0,rook);
        board.placePiece(1,0,pawn);

        assertFalse(rook.canMove(new Move(0,0,2,0,ChessColor.White),board));

    }

    @Test
    public void canMove(){


    }
}
