import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PawnTest {
    // check if pawn move twice in their 1st move
    //check if pawn move only once after 1st turn
    // check if pawn take diagonally
    // TO DO : check if pawn is promoted to a queen
    // check both colors
    // Moving vertical 1 true
    // Moving vertical 2 true
    // Moving Vertical 1 false
    // Moving Vertical 2 false
    //Moving diagonal  true
    // Moving diagonal  false
    @Test
    public void canMoveTrue(){
        Board board = new Board();
        Piece pawn  = new Pawn('\u2659', ChessColor.White, "pawnAW");
        board.placePiece(3,3,pawn);

        assertTrue(pawn.canMove(new Move(3,3,3,2,ChessColor.White), board));
    }

    @Test
    public void moveVerticalOneTrue(){
        Board board = new Board();
        ChessColor color = ChessColor.White;
        Piece pawn  = new Pawn('\u2659', color, "pawnAW");
        int startRow = 3;
        int startCol = 3;
        int endRow = 2 ;
        int endCol = 3;
        board.placePiece(startRow,startCol,pawn);
        assertTrue(pawn.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

        color = ChessColor.Black;
        Piece pawn2  = new Pawn('\u2659', color, "pawnAW");
        startRow = 3;
        startCol = 3;
        endRow = 4 ;
        endCol= 3;
        board.placePiece(startRow,startCol,pawn);
        assertTrue(pawn2.canMove(new Move(startRow, startCol, endRow,endCol,color), board));

    }





}
