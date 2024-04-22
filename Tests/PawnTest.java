import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PawnTest {
    // check if pawn move twice in their 1st move
    //check if pawn move only once after 1st turn
    // check if pawn take diagonally
    // TO DO : check if pawn is promoted to a queen
    // check both colors
    // Moving vertical 1 true done
    // Moving vertical 2 true done
    // Moving Vertical 1 false in wrong direction done
    // Moving Vertical 2 false put piece in the way; starting location done
    // Moving diagonal  true done
    // Moving diagonal  false more than 1 step; end position is empty; end position doesn't have enemy piece
    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece pawn  = new Pawn('♙', ChessColor.White, "pawnAW");
        board.placePiece(3,3,pawn);

        assertTrue(pawn.canMove(new Move(3,3,2,3,ChessColor.White), board));
    }

    @Test
    public void moveVerticalOneTrue(){
        Board board = new Board();
        ChessColor color = ChessColor.White;
        Piece pawn  = new Pawn('♙', color, "pawnAW");
        int startRow = 3;
        int startCol = 3;
        int endRow = 2 ;
        int endCol = 3;
        board.placePiece(startRow,startCol,pawn);
        assertTrue(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

        board = new Board();
        color = ChessColor.Black;
        Piece pawn2  = new Pawn('♙', color, "pawnAW");
        startRow = 3;
        startCol = 3;
        endRow = 4 ;
        endCol= 3;
        board.placePiece(startRow,startCol,pawn2);
        assertTrue(pawn2.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

    }

    @Test

    public void moveVerticalTwoTrue(){
        Board board = new Board();
        ChessColor color = ChessColor.White;
        Piece pawn  = new Pawn('♙', color, "pawnAW");
        int startRow = 6;
        int startCol = 0;
        int endRow = 4 ;
        int endCol = 0;
        board.placePiece(startRow,startCol,pawn);
        assertTrue(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

        board = new Board();
        color = ChessColor.Black;
        Piece pawn2  = new Pawn('♙', color, "pawnAW");
        startRow = 1;
        startCol = 0;
        endRow = 3 ;
        endCol= 0;
        board.placePiece(startRow,startCol,pawn2);
        assertTrue(pawn2.canMove(new Move(startRow, startCol, endRow,endCol,color), board));
    }

    @Test
    public void moveVerticalOneFalse(){
        Board board = new Board();
        ChessColor color = ChessColor.White;
        Piece pawn  = new Pawn('\u2659', color, "pawnAW");
        int startRow = 5;
        int startCol = 3;
        int endRow = 6 ;
        int endCol = 3;
        board.placePiece(startRow,startCol,pawn);
        assertFalse(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

        board = new Board();
        color = ChessColor.Black;
        Piece pawn2  = new Pawn('\u2659', color, "pawnAW");
        startRow = 3;
        startCol = 2;
        endRow = 2 ;
        endCol= 2;
        board.placePiece(startRow,startCol,pawn2);
        assertFalse(pawn2.canMove(new Move(startRow, startCol, endRow,endCol,color), board));
    }

    @Test
    public void moveVerticalTwoFalse(){
        Board board = new Board();
        ChessColor color = ChessColor.White;
        Piece pawn  = new Pawn('\u2659', color, "pawnAW");
        int startRow = 5;
        int startCol = 5;
        int endRow = 3 ;
        int endCol = 5;
        board.placePiece(startRow,startCol,pawn);
        assertFalse(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

        board = new Board();
        color = ChessColor.Black;
        Piece pawn2  = new Pawn('\u2659', color, "pawnAW");
        startRow = 3;
        startCol = 4;
        endRow = 5 ;
        endCol= 4;
        board.placePiece(startRow,startCol,pawn2);
        assertFalse(pawn2.canMove(new Move(startRow, startCol, endRow,endCol,color), board));
    }

    @Test
    public void moveVerticalTwoFalsePieceInWay(){
        Board board = new Board();
        ChessColor color = ChessColor.White;
        Piece pawn  = new Pawn('\u2659', color, "pawnAW");
        Piece pawn2 = new Pawn('\u2659', color, "pawnAW");
        board.placePiece(5,4,pawn2);
        int startRow = 6;
        int startCol = 4;
        int endRow = 4 ;
        int endCol = 4;
        board.placePiece(startRow,startCol,pawn);
        assertFalse(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

        board = new Board();
        color = ChessColor.Black;
        Piece pawn3  = new Pawn('\u2659', color, "pawnAW");
        Piece pawn4  = new Pawn('\u2659', color, "pawnAW");
        board.placePiece(2,2,pawn4);
        startRow = 1;
        startCol = 2;
        endRow = 3 ;
        endCol= 2;
        board.placePiece(startRow,startCol,pawn3);
        assertFalse(pawn2.canMove(new Move(startRow, startCol, endRow,endCol,color), board));
    }

    @Test
    public void moveDiagonalWhiteTrue(){
        Board board = new Board();
        ChessColor color = ChessColor.White;
        ChessColor color2 = ChessColor.Black;
        Piece pawn  = new Pawn('\u2659', color, "pawnAW");
        Piece pawn2 = new Pawn('\u2659', color2, "pawnAB");
        int startRow = 4;
        int startCol = 4;
        int endRow = 3 ;
        int endCol = 5;
        board.placePiece(startRow,startCol,pawn);
        board.placePiece(endRow,endCol,pawn2);
        assertTrue(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));


    }

    @Test
    public void moveDiagonalBlackTrue(){
        Board board = new Board();
        ChessColor color = ChessColor.Black;
        ChessColor color2 = ChessColor.White;
        Piece pawn  = new Pawn('\u2659', color, "pawnAW");
        Piece pawn2 = new Pawn('\u2659', color2, "pawnAB");
        int startRow = 2;
        int startCol = 3;
        int endRow = 3 ;
        int endCol = 4;
        board.placePiece(startRow,startCol,pawn);
        board.placePiece(endRow,endCol,pawn2);
        assertTrue(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));
    }

    @Test public void moveDiagonalWhiteFalse(){
        Board board = new Board();
        ChessColor color = ChessColor.White;
        Piece pawn  = new Pawn('\u2659', color, "pawnAW");
        int startRow = 4;
        int startCol = 4;
        int endRow = 3 ;
        int endCol = 5;
        board.placePiece(startRow,startCol,pawn);
        assertFalse(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

        board = new Board();
        color = ChessColor.White;
        pawn  = new Pawn('\u2659', color, "pawnAW");
        startRow = 5;
        startCol = 1;
        endRow = 3;
        endCol = 3;
        board.placePiece(startRow,startCol,pawn);
        assertFalse(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

    }








}
