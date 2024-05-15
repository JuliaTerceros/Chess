public class Move {
    int currentX;
    int currentY;
    int nextX;
    int nextY;

    ChessColor color;

    public Move(int currentX, int currentY, int nextX, int nextY, ChessColor color) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.nextX = nextX;
        this.nextY = nextY;
        this.color = color;

    }
}
