import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void testDisplayingBoard(){
        Board board = new Board();

        String actual = board.displayBoard();
        System.out.println(actual);
//        assertEquals()
    }

    @Test
    public void isEmptyPositionTrue() {
        Board board = new Board();
        assertTrue(board.isEmptyPosition(1,5));
    }

    @Test
    public void isEmptyPositionFalse() {
        Board board = new Board();
        board.placePiece(1,5,new Rook('♜',ChessColor.Black, "rookQB"));
        assertFalse(board.isEmptyPosition(1,5));
    }




    // placePiece
    @Test
    public void placePieceTest() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        board.placePiece(1,5, rook);
        assertEquals(rook, board.getPiece(1,5));
    }

    // isThereClearPathHorizontalLeftTrue
        @Test
    public void  isThereClearPathHorizontalLeftTrue() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        board.placePiece(1,5, rook);
        assertTrue(board.isThereClearPathHorizontal(1,5,1,3));
    }

    // isThereClearPathHorizontalLeftFalse
    @Test
    public void  isThereClearPathHorizontalLeftFalse() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        Piece rook2 = new Rook('♜',ChessColor.Black, "rookQB");
        board.placePiece(1,5, rook);
        board.placePiece(1,4, rook2);
        assertFalse(board.isThereClearPathHorizontal(1,5,1,3));
    }


    // isThereClearPathHorizontalRightTrue
    @Test
    public void  isThereClearPathHorizontalRightTrue() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        board.placePiece(1,5, rook);
        assertTrue(board.isThereClearPathHorizontal(1,5,1,7));
    }


    // isThereClearPathHorizontalRightFalse
    @Test
    public void  isThereClearPathHorizontalRightFalse() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        Piece rook2 = new Rook('♜',ChessColor.Black, "rookQB");
        board.placePiece(1,5, rook);
        board.placePiece(1,6, rook2);
        assertFalse(board.isThereClearPathHorizontal(1,5,1,7));
    }

    // isThereClearPathVerticalUpTrue

    @Test
    public void  isThereClearPathVerticalUpTrue() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        board.placePiece(4,5, rook);
        assertTrue(board.isThereClearPathVertical(4,5,2,5));
    }


    // isThereClearPathVerticalUpFalse

    @Test
    public void  isThereClearPathVerticalUpFalse() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        Piece rook2 = new Rook('♜',ChessColor.Black, "rookQB");
        board.placePiece(4,6, rook);
        board.placePiece(3,6, rook2);
        assertFalse(board.isThereClearPathVertical(4,6,2,6));
    }

    // isThereClearPathVerticalDownTrue
    @Test
    public void  isThereClearPathVerticalDownTrue() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        int startRow = 0;
        int startCol = 2;
        board.placePiece(startRow,startCol,rook);
        assertTrue(board.isThereClearPathVertical(startRow,startCol,3,2));
    }

    // isThereClearPathVerticalDownFalse
    @Test
    public void  isThereClearPathVerticalDownFalse() {
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        Piece rook2 = new Rook('♜',ChessColor.Black, "rookQB");
        int startRow = 1;
        int startCol = 3;
        int endRow = 3;
        int endCol = 3;
        board.placePiece(startRow,startCol, rook);
        board.placePiece(2,3, rook2);
        assertFalse(board.isThereClearPathVertical(startRow,startCol,endRow,endCol));
    }

    //isThereClearPathDiagonalQ1True
    @Test
    public void  isThereClearPathDiagonalQ1True() {
        // TODO: 
        Board board = new Board();
        Piece rook = new Rook('♜',ChessColor.Black, "rookQB");
        int startRow = 0;
        int startCol = 2;
        board.placePiece(startRow,startCol,rook);
        assertTrue(board.isThereClearPathVertical(startRow,startCol,3,2));
    }
    //isThereClearPathDiagonalQ2True
    //isThereClearPathDiagonalQ3True
    //isThereClearPathDiagonalQ4True

    //isThereClearPathDiagonalQ1False
    //isThereClearPathDiagonalQ2False
    //isThereClearPathDiagonalQ3False
    //isThereClearPathDiagonalQ4False
}
