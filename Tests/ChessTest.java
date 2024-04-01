import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChessTest {
    // check if pawn move twice in their 1st move
    //check if pawn move only once after 1st turn
    // check if pawn take diagonally
    //check if pawn is promoted to a queen

    @Test
    public void testDisplayingBoard(){
        Board board = new Board();

        String actual = board.displayBoard();
        System.out.println(actual);
//        assertEquals()
    }


}
