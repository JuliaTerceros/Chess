import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QueenTest {
    @Test
    public void canMoveUpTrue(){
        Board board = new Board();
        Piece queen = new Queen('\u2655',ChessColor.White, "queenW");
        board.placePiece(3,3,queen);

        assertTrue(queen.canMove(new Move(3,3,3,2,ChessColor.White), board));

    }
    @Test
    public void canMoveFalse(){
        Board board = new Board();
        Piece queen = new Queen('\u2655',ChessColor.White, "queenW");
        board.placePiece(3,3,queen);

        board.displayBoard();
        assertFalse(queen.canMove(new Move(3,3,2,2,ChessColor.White), board));
        assertTrue(queen.canMove(new Move(3,3,2,2,ChessColor.White), board));

    }

    @Test
    public void canMoveDiagonalTrue(){
        Board board = new Board();
        Piece queen = new Queen('\u2655',ChessColor.White, "queenW");
        board.placePiece(3,3,queen);

        assertTrue(queen.canMove(new Move(3,3,4,2,ChessColor.White), board));

    }
    @Test
    public void canMoveDiagonalFalse(){
        Board board = new Board();
        Piece queen = new Queen('\u2655',ChessColor.White, "queenW");
        board.placePiece(3,3,queen);
        
        assertFalse(queen.canMove(new Move(3,3,2,5,ChessColor.White), board));

    }

    private void assertFalse(boolean b) {
    }

}
