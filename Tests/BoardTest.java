import org.junit.Test;

public class BoardTest {
    @Test
    public void testDisplayingBoard(){
        Board board = new Board();

        String actual = board.displayBoard();
        System.out.println(actual);
//        assertEquals()
    }
}
