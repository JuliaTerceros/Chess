import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BishopTest {
    @Test
    public void canMoveTrueDiagonally(){
        Board board = new Board();
        Piece bishop = new Bishop('♝',ChessColor.Black, "bishopKB");
        board.placePiece(3,3,bishop);

        assertTrue(bishop.canMove(new Move(3,3,2,2,ChessColor.White), board));
        assertTrue(bishop.canMove(new Move(3,3,2,4,ChessColor.White), board));
        assertTrue(bishop.canMove(new Move(3,3,4,4,ChessColor.White), board));
        assertTrue(bishop.canMove(new Move(3,3,4,2,ChessColor.White), board));
    }

    @Test
    public void canMoveFalseCaptureSameColor(){
        Board board = new Board();
        Piece bishop = new Bishop('♝',ChessColor.Black, "bishopKB");
        Piece pawn = new Pawn('♟', ChessColor.Black, "pawnAB");
        board.placePiece(3,3,bishop);
        board.placePiece(6,0,pawn);
        assertFalse(bishop.canMove(new Move(3,3,6,0,ChessColor.Black),board));
    }

    @Test
    public void canMoveTrueCaptureDiffColor(){
        Board board = new Board();
        Piece bishop = new Bishop('♝',ChessColor.Black, "bishopKB");
        Piece pawn = new Pawn('♟', ChessColor.White, "pawnAB");
        board.placePiece(3,3,bishop);
        board.placePiece(6,0,pawn);
        assertTrue(bishop.canMove(new Move(3,3,6,0,ChessColor.Black),board));
    }
    @Test
    public void canMoveFalsePathNotClear(){
        Board board = new Board();
        Piece bishop = new Bishop('♝',ChessColor.Black, "bishopKB");
        Piece pawn = new Pawn('♟', ChessColor.White, "pawnAB");
        board.placePiece(3,3,bishop);
        board.placePiece(5,1,pawn);
        assertFalse(bishop.canMove(new Move(3,3,6,0,ChessColor.Black),board));
    }
    @Test
    public void canMoveFalseHorizontal(){
        Board board = new Board();
        Piece bishop = new Bishop('♝',ChessColor.Black, "bishopKB");
        board.placePiece(3,3,bishop);
        assertFalse(bishop.canMove(new Move(3,3,3,4,ChessColor.Black),board));
    }

}
