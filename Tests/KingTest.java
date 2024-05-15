import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KingTest {
    @Test
    public void canMoveTrueAllDirections(){
        Board board = new Board();
        Piece king = new King('\u2654',ChessColor.White, "kingW");
        int startRow = 3;
        int startCol = 3;
        int endRow = 3;
        int endCol = 4;
        board.placePiece(startRow,startCol,king);


        assertTrue(king.canMove(new Move(startRow, startCol, endRow, endCol, ChessColor.White), board));
        assertTrue(king.canMove(new Move(startRow, startCol, 4,4, ChessColor.White), board));
        assertTrue(king.canMove(new Move(startRow, startCol,4, 3, ChessColor.White), board));
        assertTrue(king.canMove(new Move(startRow, startCol,4, 2, ChessColor.White), board));
        assertTrue(king.canMove(new Move(startRow, startCol,2, 2, ChessColor.White), board));
        assertTrue(king.canMove(new Move(startRow, startCol, 3,2, ChessColor.White), board));
        assertTrue(king.canMove(new Move(startRow, startCol,2,3 , ChessColor.White), board));
        assertTrue(king.canMove(new Move(startRow, startCol, 2,4, ChessColor.White), board));

    }
    @Test
    public void canMoveFalseMoveMoreThanOneStep() {
        Board board = new Board();
        Piece king = new King('\u2654', ChessColor.White, "kingW");
        int startRow = 3;
        int startCol = 3;
        int endRow = 3;
        int endCol = 5;
        board.placePiece(startRow, startCol, king);

        assertFalse(king.canMove(new Move(startRow, startCol, endRow, endCol, ChessColor.White), board));
    }
    @Test
    public void canMoveTrueCaptureDiffColor(){
        Board board = new Board();
        Piece king = new King('\u2654', ChessColor.White, "kingW");
        int startRow = 3;
        int startCol = 3;
        int endRow = 3;
        int endCol = 4;
        board.placePiece(startRow, startCol, king);
        Piece pawn = new Pawn('♟', ChessColor.Black, "pawnAB");
        board.placePiece(endRow, endCol, pawn);
        assertTrue(king.canMove(new Move(startRow, startCol, endRow, endCol, ChessColor.White), board));
    }
    @Test
    public void canMoveFalseCaptureSameColor(){
        Board board = new Board();
        Piece king = new King('\u2654', ChessColor.White, "kingW");
        int startRow = 3;
        int startCol = 3;
        int endRow = 3;
        int endCol = 4;
        board.placePiece(startRow, startCol, king);
        Piece pawn = new Pawn('♟', ChessColor.White, "pawnAB");
        board.placePiece(endRow, endCol, pawn);
        assertFalse(king.canMove(new Move(startRow, startCol, endRow, endCol, ChessColor.White), board));
    }
}
