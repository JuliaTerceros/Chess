public class Board {

    //Board should be 8x8, each "tile" should have either a piece or null
    //CHange string to pieces
    public Piece[][] board = new Piece[8][8];

    public Board(){
        this.board[0][0] = new Rook('♜',ChessColor.Black, "rookQB"); //rook
        this.board[0][1] = new Knight('\u265E',ChessColor.Black, "knightQB"); //knight
        this.board[0][2] = new Bishop('\u265D',ChessColor.Black, "bishopQB"); //bishop
        this.board[0][3] = new Queen('\u265B',ChessColor.Black, "queenB"); //queen
        this.board[0][4] = new King('\u265A',ChessColor.Black, "kingB");// king
        this.board[0][5] = new Bishop('\u265D',ChessColor.Black, "bishopKB"); // bishop
        this.board[0][6] = new Knight('\u265E',ChessColor.Black, "knightKB"); // knight
        this.board[0][7] = new Rook('\u265C',ChessColor.Black, "rookKB"); //rook

        this.board[1][0] = new Pawn('\u265F', ChessColor.Black, "pawnAB");
        this.board[1][1] = new Pawn('\u265F', ChessColor.Black, "pawnBB");
        this.board[1][2] = new Pawn('\u265F', ChessColor.Black, "pawnCB");
        this.board[1][3] = new Pawn('\u265F', ChessColor.Black, "pawnDB");
        this.board[1][4] = new Pawn('\u265F', ChessColor.Black, "pawnEB");
        this.board[1][5] = new Pawn('\u265F', ChessColor.Black,"pawnFB");
        this.board[1][6] = new Pawn('\u265F', ChessColor.Black, "pawnGB");
        this.board[1][7] = new Pawn('\u265F', ChessColor.Black, "pawnHB");

        this.board[7][0] = new Rook('\u2656',ChessColor.White, "rookQW");
        this.board[7][1] = new Knight('\u2658',ChessColor.White, "knightQW");
        this.board[7][2] = new Bishop('\u2657',ChessColor.White, "bishopQW");
        this.board[7][3] = new Queen('\u2655',ChessColor.White, "queenW");
        this.board[7][4] = new King('\u2654',ChessColor.White, "kingW");
        this.board[7][5] = new Bishop('\u2657',ChessColor.White, "bishopKW");
        this.board[7][6] = new Knight('\u2658',ChessColor.White, "knightKW");
        this.board[7][7] = new Rook('\u2656',ChessColor.White, "rookKW");

        this.board[6][0] = new Pawn('\u2659', ChessColor.White, "pawnAW");
        this.board[6][1] = new Pawn('\u2659', ChessColor.White, "pawnBW");
        this.board[6][2] = new Pawn('\u2659', ChessColor.White, "pawnCW");
        this.board[6][3] = new Pawn('\u2659', ChessColor.White, "pawnDW");
        this.board[6][4] = new Pawn('\u2659', ChessColor.White, "pawnEW");
        this.board[6][5] = new Pawn('\u2659', ChessColor.White, "pawnFW");
        this.board[6][6] = new Pawn('\u2659', ChessColor.White, "pawnGW");
        this.board[6][7] = new Pawn('\u2659', ChessColor.White, "pawnHW");

    }


    //isEmptyPosition(int x, int y)
    public boolean isEmptyPosition(int x, int y) {
        if (!(this.board[x -1][y -1].equals(" "))){
            return false;

        }
        else  {
            return true;
        }
    }



//Displays Board

    public void DisplayBoard(){
//        System.out.println("|---|---|---|---|---|---|---|---|");
//        System.out.println("| "+ this.board[0][0].toString() + " | " + this.board[0][1].toString() + " | " + this.board[0][2].toString() + " | " + this.board[0][3].toString()+ " | " + this.board[0][4].toString() + " | " + this.board[0][5].toString()+ " | "+ this.board[0][6].toString() + " | "+ this.board[0][7].toString() +" |");
//        System.out.println("|-------------------------------|");
//        System.out.println("| "+ this.board[1][0].toString() + " | " + this.board[1][1].toString() + " | " + this.board[1][2].toString() + " | " + this.board[1][3].toString()+ " | " + this.board[1][4].toString() + " | " + this.board[1][5].toString()+ " | "+ this.board[1][6].toString() + " | "+ this.board[1][7].toString() +" |");
//        System.out.println("|-------------------------------|");
//        System.out.println("| "+ this.board[2][0].toString() + " | " + this.board[2][1].toString() + " | " + this.board[2][2].toString() + " | " + this.board[2][3].toString()+ " | " + this.board[2][4].toString() + " | " + this.board[2][5].toString()+ " | "+ this.board[2][6].toString() + " | "+ this.board[2][7].toString() +" |");
//        System.out.println("|-------------------------------|");
//        System.out.println("| "+ this.board[3][0].toString() + " | " + this.board[3][1].toString() + " | " + this.board[3][2].toString() + " | " + this.board[3][3].toString()+ " | " + this.board[3][4].toString() + " | " + this.board[3][5].toString()+ " | "+ this.board[3][6].toString() + " | "+ this.board[3][7].toString() +" |");
//        System.out.println("|-------------------------------|");
//        System.out.println("| "+ this.board[4][0].toString() + " | " + this.board[4][1].toString() + " | " + this.board[4][2].toString() + " | " + this.board[4][3].toString()+ " | " + this.board[4][4].toString() + " | " + this.board[4][5].toString()+ " | "+ this.board[4][6].toString() + " | "+ this.board[4][7].toString() +" |");
//        System.out.println("|-------------------------------|");
//        System.out.println("| "+ this.board[5][0].toString() + " | " + this.board[5][1].toString() + " | " + this.board[5][2].toString() + " | " + this.board[5][3].toString()+ " | " + this.board[5][4].toString() + " | " + this.board[5][5].toString()+ " | "+ this.board[5][6].toString() + " | "+ this.board[5][7].toString() +" |");
//        System.out.println("|-------------------------------|");
//        System.out.println("| "+ this.board[6][0].toString() + " | " + this.board[6][1].toString() + " | " + this.board[6][2].toString() + " | " + this.board[6][3].toString()+ " | " + this.board[6][4].toString() + " | " + this.board[6][5].toString()+ " | "+ this.board[6][6].toString() + " | "+ this.board[7][7].toString() +" |");
//        System.out.println("|-------------------------------|");
//        System.out.println("| "+ this.board[7][0].toString() + " | " + this.board[7][1].toString() + " | " + this.board[7][2].toString() + " | " + this.board[7][3].toString()+ " | " + this.board[7][4].toString() + " | " + this.board[7][5].toString()+ " | "+ this.board[7][6].toString() + " | "+ this.board[7][7].toString() +" |");
//        System.out.println("|---|---|---|---|---|---|---|---|");


        for (int row = 0; row < 8; row++){
            for (int column = 0; column < 8; column++){
                if (this.board[row][column] != null){
                    System.out.print(" " + this.board[row][column].toString() + " " );
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //apply move

    //isThereClearPath







}
