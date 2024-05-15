import java.util.Scanner;

public class Players {
    ChessColor color;
    boolean isWhite; //makes sure the playing is playing as white

    public Players(ChessColor color, boolean isWhite) {
        this.color = color;
        this.isWhite = isWhite;
    }

    public ChessColor getColor(Board board) {


        return color;
    }

    public boolean isWhite(Board board, Move move) {

        return isWhite;
    }
    //Players need to have some type of color to represent turn
//public final String symbol;

    public Move getTurn() {
        int startRow;
        int startCol;
        int endRow;
        int endCol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting Row");
        startRow = scanner.nextInt();
        System.out.println("Enter starting Column");
        startCol = scanner.nextInt();
        System.out.println("Enter next Row");
        endRow = scanner.nextInt();
        System.out.println("Enter next Column");
        endCol = scanner.nextInt();

        while (!(startRow >= 0 && startRow <= 7 && startCol >= 0 && startCol <= 7 &&
                endRow >= 0 && endRow <= 7 && endCol >= 0 && endCol <= 7)) {
            System.out.println("Please enter numbers between 0 and 7.");
            System.out.println("Enter starting Row");
            startRow = scanner.nextInt();
            System.out.println("Enter starting Column");
            startCol = scanner.nextInt();
            System.out.println("Enter next Row");
            endRow = scanner.nextInt();
            System.out.println("Enter next Column");
            endCol = scanner.nextInt();
        }

        while (startRow == endRow && startCol == endCol) {
            System.out.println("Please enter different starting and ending location.");
            System.out.println("Enter starting Row");
            startRow = scanner.nextInt();
            System.out.println("Enter starting Column");
            startCol = scanner.nextInt();
            System.out.println("Enter next Row");
            endRow = scanner.nextInt();
            System.out.println("Enter next Column");
            endCol = scanner.nextInt();
        }

        return new Move(startRow, startCol, endRow, endCol, color);

    }
}
