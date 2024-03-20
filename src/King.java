public class King extends Piece{
    public King(String pos, ChessColor color) {
        super(pos, color);
    }
    // can move an any direction once
    // can't move to a location that will put him in danger
}
