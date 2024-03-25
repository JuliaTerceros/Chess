public class King extends Piece{
    public King(char symbol, ChessColor color, String id) {
        super(symbol, color, id);
    }

    // can move an any direction once
    // can't move to a location that will put him in danger
}
