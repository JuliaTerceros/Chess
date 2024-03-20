public class Board {

    //Board should be 8x8, each "tile" should have either a piece or null
    //CHange string to pieces
    public Piece[][] board = new Piece[8][8];

    public Board(){
        this.board[0][0] = new Rook("rookQ",ChessColor.Black);
        this.board[0][1] = new Knight("knightQ",ChessColor.Black);
        this.board[0][2] = new Bishop("bishopQ",ChessColor.Black);
        this.board[0][3] = new Queen("queenQ",ChessColor.Black);
        this.board[0][4] = new King("kingQ",ChessColor.Black);
        this.board[0][5] = new Bishop("bishopQ",ChessColor.Black);
        this.board[0][6] = new Knight("knightQ",ChessColor.Black);
        this.board[0][7] = new Rook("rookQ",ChessColor.Black);

        this.board[1][0] = new Pawn("pawnA", ChessColor.Black);
        this.board[1][1] = new Pawn("pawnB", ChessColor.Black);
        this.board[1][2] = new Pawn("pawnC", ChessColor.Black);
        this.board[1][3] = new Pawn("pawnD", ChessColor.Black);
        this.board[1][4] = new Pawn("pawnE", ChessColor.Black);
        this.board[1][5] = new Pawn("pawnF", ChessColor.Black);
        this.board[1][6] = new Pawn("pawnG", ChessColor.Black);
        this.board[1][7] = new Pawn("pawnH", ChessColor.Black);

        this.board[7][0] = new Rook("rookQ",ChessColor.White);
        this.board[7][1] = new Knight("knightQ",ChessColor.White);
        this.board[7][2] = new Bishop("bishopQ",ChessColor.White);
        this.board[7][3] = new Queen("queenQ",ChessColor.White);
        this.board[7][4] = new King("kingQ",ChessColor.White);
        this.board[7][5] = new Bishop("bishopQ",ChessColor.White);
        this.board[7][6] = new Knight("knightQ",ChessColor.White);
        this.board[7][7] = new Rook("rookQ",ChessColor.White);

        this.board[6][0] = new Pawn("pawnA", ChessColor.White);
        this.board[6][1] = new Pawn("pawnB", ChessColor.White);
        this.board[6][2] = new Pawn("pawnC", ChessColor.White);
        this.board[6][3] = new Pawn("pawnD", ChessColor.White);
        this.board[6][4] = new Pawn("pawnE", ChessColor.White);
        this.board[6][5] = new Pawn("pawnF", ChessColor.White);
        this.board[6][6] = new Pawn("pawnG", ChessColor.White);
        this.board[6][7] = new Pawn("pawnH", ChessColor.White);
    }


    //isEmptyPosition(int x, int y)

    public void DisplayBoard(){
        System.out.println("|---|---|---|---|---|---|---|---|");
        System.out.println();
        System.out.println("|-------------------------------|");
        System.out.println();
        System.out.println("|---|---|---|---|---|---|---|---|");
        System.out.println();
        System.out.println("|---|---|---|---|---|---|---|---|");

        System.out.println("|-------------------------------|");

        System.out.println("|---|---|---|---|---|---|---|---|");

        System.out.println("|-------------------------------|");

        System.out.println("|---|---|---|---|---|---|---|---|");

        System.out.println("|-------------------------------|");


        for (int row = 0; row < 8; row++){
            for (int column = 0; column < 8; column++){
                
            }

        }


    }
    //Checks if position has a place already
    //returns false if not empty
    //returns true if spot is empty

    //displayBoard()

    //displays board

    //winner
//check if king is in check

    //check is there is no obstruction to desired location
    //apply move






}
