public abstract class Piece {

    //color
    //position
    ChessColor color;
    String pos;

    public Piece (String pos, ChessColor color) {
        this.color = color;
        this.pos = pos;
    }
}
