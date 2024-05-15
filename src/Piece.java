import java.util.Objects;

public abstract class Piece {

    //color
    //position
    ChessColor color;
    String id;
    char symbol;


    public Piece(char symbol, ChessColor color, String id) {
        this.symbol = symbol;
        this.color = color;
        this.id = id;
    }

    public String toString() {
        return Character.toString(symbol);
    }

    public abstract boolean canMove(Move move, Board board);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piece piece)) return false;
        return this.symbol == piece.symbol && this.color == piece.color && this.id.equals(piece.id);
    }
}
