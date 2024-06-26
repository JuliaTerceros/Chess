public class Board {

    //Board should be 8x8, each "tile" should have either a piece or null
    //Change string to pieces
    public Piece[][] board = new Piece[8][8];

    public void setUpBoard() {
        this.board[0][0] = new Rook('♜', ChessColor.Black, "rookQB"); //rook
        this.board[0][1] = new Knight('♞', ChessColor.Black, "knightQB"); //knight
        this.board[0][2] = new Bishop('♝', ChessColor.Black, "bishopQB"); //bishop
        this.board[0][3] = new Queen('♛', ChessColor.Black, "queenB"); //queen
        this.board[0][4] = new King('♚', ChessColor.Black, "kingB");// king
        this.board[0][5] = new Bishop('♝', ChessColor.Black, "bishopKB"); // bishop
        this.board[0][6] = new Knight('♞', ChessColor.Black, "knightKB"); // knight
        this.board[0][7] = new Rook('♜', ChessColor.Black, "rookKB"); //rook

        this.board[1][0] = new Pawn('♟', ChessColor.Black, "pawnAB");
        this.board[1][1] = new Pawn('♟', ChessColor.Black, "pawnBB");
        this.board[1][2] = new Pawn('♟', ChessColor.Black, "pawnCB");
        this.board[1][3] = new Pawn('♟', ChessColor.Black, "pawnDB");
        this.board[1][4] = new Pawn('♟', ChessColor.Black, "pawnEB");
        this.board[1][5] = new Pawn('♟', ChessColor.Black, "pawnFB");
        this.board[1][6] = new Pawn('♟', ChessColor.Black, "pawnGB");
        this.board[1][7] = new Pawn('♟', ChessColor.Black, "pawnHB");

        this.board[7][0] = new Rook('♖', ChessColor.White, "rookQW");
        this.board[7][1] = new Knight('♘', ChessColor.White, "knightQW");
        this.board[7][2] = new Bishop('♗', ChessColor.White, "bishopQW");
        this.board[7][3] = new Queen('♕', ChessColor.White, "queenW");
        this.board[7][4] = new King('♔', ChessColor.White, "kingW");
        this.board[7][5] = new Bishop('♗', ChessColor.White, "bishopKW");
        this.board[7][6] = new Knight('♘', ChessColor.White, "knightKW");
        this.board[7][7] = new Rook('♖', ChessColor.White, "rookKW");

        this.board[6][0] = new Pawn('♙', ChessColor.White, "pawnAW");
        this.board[6][1] = new Pawn('♙', ChessColor.White, "pawnBW");
        this.board[6][2] = new Pawn('♙', ChessColor.White, "pawnCW");
        this.board[6][3] = new Pawn('♙', ChessColor.White, "pawnDW");
        this.board[6][4] = new Pawn('♙', ChessColor.White, "pawnEW");
        this.board[6][5] = new Pawn('♙', ChessColor.White, "pawnFW");
        this.board[6][6] = new Pawn('♙', ChessColor.White, "pawnGW");
        this.board[6][7] = new Pawn('♙', ChessColor.White, "pawnHW");

    }


    //isEmptyPosition(int x, int y)
    public boolean isEmptyPosition(int x, int y) {
        return this.board[x][y] == null;
    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public boolean isOpponentPieceThere(int row, int col, ChessColor color) {
        return board[row][col].color != color;
    }


    //Displays Board
    public void displayBoard() {
        System.out.println(this.toString());
    }

    public String toString() {
        StringBuilder stringOfBoard = new StringBuilder();

//        stringOfBoard.append("0\u2009\u20081\u2009\u20082\u2009\u20083\u2009\u20084\u2009\u20085\u2009\u20086\u20097\u2009\n");
//        stringOfBoard.append()
        for (int row = 0; row < 8; row++) {
//            stringOfBoard.append(row).append(" ");
            for (int column = 0; column < 8; column++) {
                if (this.board[row][column] != null) {
                    stringOfBoard.append("\u2009").append(this.board[row][column].toString()).append('\u2008');
                } else {
                    stringOfBoard.append("\u200A\u200A\u2008.\u2009\u200A");
                }
            }
            stringOfBoard.append("\n");
        }
        return stringOfBoard.toString();
    }

    public void placePiece(int x, int y, Piece piece) {
        this.board[x][y] = piece;

    }

    public void removePiece(int x, int y) {
        this.board[x][y] = null;
    }


    //TO DO: If pawn reaches end, change to queen
    public void changePawnToQueen(Pawn pawn, Move move, Board board) {
        if (pawn.pawnAtEnd(move, board)) {
            removePiece(move.currentX, move.currentY);
            placePiece(move.currentX, move.currentY, pawn);
        }
    }

    public void applyMove(Move move){
        Piece piece = this.board[move.currentX][move.currentY];
        if(piece.canMove(move, this)){
            this.board[move.nextX][move.nextY] = piece;
            this.board[move.currentX][move.currentY] = null;
        }
    }

    public boolean isThereClearPath(Move move) {
        int startRow = move.currentX;
        int startCol = move.currentY;
        int endRow = move.nextX;
        int endCol = move.nextY;
        if (this.board[endRow][endCol] != null &&
                !isOpponentPieceThere(endRow, endCol, this.board[startRow][startCol].color)) {
            return false;
        }

        if (startCol == endCol && startRow != endRow) {
            return isThereClearPathVertical(startRow, startCol, endRow, endCol);
        } else if (startRow == endRow && startCol != endCol) {
            return isThereClearPathHorizontal(startRow, startCol, endRow, endCol);
        } else if (Math.abs(startRow - endRow) == Math.abs(startCol - endCol)) {
            return isThereClearPathDiagonal(startRow, startCol, endRow, endCol);
        }

        return false;
    }

    public boolean isThereClearPathHorizontal(int startRow, int startCol, int endRow, int endCol) {
        for (int i = Math.min(startCol, endCol); i < Math.max(startCol, endCol) - 1; i++) {
            if (this.board[startRow][i + 1] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean isThereClearPathVertical(int startRow, int startCol, int endRow, int endCol) {
        for (int i = Math.min(startRow, endRow); i < Math.max(startRow, endRow) - 1; i++) {
            if (this.board[i + 1][startCol] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean isThereClearPathDiagonal(int startRow, int startCol, int endRow, int endCol) {
        int l = startCol;
        if (startRow > endRow && startCol > endCol) {
            for (int i = startRow; i > endRow - 1; i--) {
                if (this.board[i - 1][l - 1] != null) {
                    return false;
                }
                l--;
            }
        }

        if (startRow > endRow && startCol < endCol) {
            for (int i = startRow; i > endRow - 1; i--) {
                if (this.board[i - 1][l + 1] != null) {
                    return false;
                }
                l++;
            }
        }

        if (startRow < endRow && startCol < endCol) {
            for (int i = startRow; i < endRow - 1; i++) {
                if (this.board[i + 1][l + 1] != null) {
                    return false;
                }
                l++;
            }
        }

        if (startRow < endRow && startCol > endCol) {
            for (int i = startRow; i < endRow - 1; i++) {
                if (this.board[i + 1][l - 1] != null) {
                    return false;
                }
                l--;
            }
        }
        return true;
    }


}
