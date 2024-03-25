public abstract class Piece {

    //color
    //position
    ChessColor color;
    String id;
    char symbol;

    public Piece (char symbol, ChessColor color, String id) {
        this.symbol = symbol;
        this.color = color;
        this.id = id;
    }

    public String toString(){
        return Character.toString(symbol);
    }
}
