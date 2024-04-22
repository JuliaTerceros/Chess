import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KnightTest {

    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece knight = new Knight('♞',ChessColor.Black, "knightKB");
        board.placePiece(2,1,knight);

        assertTrue(knight.canMove(new Move(2,1,3,3,ChessColor.Black),board));
    }

    @Test
    public void canMoveFalse(){
        Board board = new Board();
        Piece knight = new Knight('♞',ChessColor.Black, "knightKB");
        board.placePiece(2,1,knight);

        assertFalse(knight.canMove(new Move(2,1,3,2,ChessColor.Black),board));
    }

    @Test
    public void canJumpOverTrue(){
        Board board = new Board();
        Piece knight = new Knight('♞',ChessColor.Black, "knightKB");
        Piece pawn = new Pawn('♟', ChessColor.Black, "pawnAB");
        board.placePiece(2,1,knight);
        board.placePiece(2,3,pawn);
        assertTrue(knight.canMove(new Move(2,1,3,3,ChessColor.Black),board));
    }

    @Test
    public void canJumpOverFalse(){
        Board board = new Board();
        Piece knight = new Knight('♞',ChessColor.Black, "knightKB");
        Piece pawn = new Pawn('♟', ChessColor.Black, "pawnAB");
        board.placePiece(2,1,knight);
        board.placePiece(2,3,pawn);
        assertTrue(knight.canMove(new Move(2,1,3,3,ChessColor.Black),board));
    }




    }




