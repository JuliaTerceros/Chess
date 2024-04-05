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
        assertEquals(rook, board[1][5]);
    }
    // isThereClearPathHorizontalLeftTrue
    // isThereClearPathHorizontalLeftFalse

    // isThereClearPathHorizontalRightTrue
    // isThereClearPathHorizontalRightFalse


    // isThereClearPathVerticalUpTrue
    // isThereClearPathVerticalUpFalse

    // isThereClearPathVerticalDownTrue
    // isThereClearPathVerticalDownFalse

    //isThereClearPathDiagonalQ1True
    //isThereClearPathDiagonalQ2True
    //isThereClearPathDiagonalQ3True
    //isThereClearPathDiagonalQ4True

    //isThereClearPathDiagonalQ1False
    //isThereClearPathDiagonalQ2False
    //isThereClearPathDiagonalQ3False
    //isThereClearPathDiagonalQ4False
}
