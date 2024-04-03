public class Players {
    String name;
    boolean isWhite; //makes sure the playing is playing as white
    public Players (String name, boolean isWhite){
        this.name = name;
        this.isWhite = isWhite;
    }
    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return isWhite;
    }
    //Players need to have some type of color to represent turn
//public final String symbol;
}
