package com.jonathan.tiktakto;

public class Gameboard {

    private int[][] board;

    public Gameboard() {
        this.board = new int[3][3];

        for(int p = 0; p < 3; p++) {
            for (int i = 0; i < 3; i++) {
                this.setElements(i, p, Pieces.Empty);
            }
        }
    }

    public void setElements(int x, int y, Pieces piece) {
        this.board[x][y] = piece.ordinal();
    }

    public Pieces getElement(int x, int y) {

        // Get the value from the board
        int val = this.board[x][y];

        // convert value to Pieces
        Pieces[] values = Pieces.values();
        Pieces piece = values[val];
        // return piece
        return piece;

    }

    public boolean IsWon(Pieces piece) {

        for(int x = 0; x < 3; x++) {
            if(this.getElement(x, 0) == this.getElement(x, 1) && this.getElement(x, 0) == this.getElement(x, 2)) {
                return true;
            }
        }

        for(int y = 0; y < 3; y++) {
            if (this.getElement(0, y) == this.getElement(1, y) && this.getElement(0, y) == this.getElement(2, y)) {
                return true;

            }

        }

                Pieces val00 = this.getElement(0, 0);
                Pieces val02 = this.getElement(0, 2);
                Pieces val11 = this.getElement(1, 1);
                Pieces val20 = this.getElement(2, 0);
                Pieces val22 = this.getElement(2, 2);

                if (piece == val00 && piece == val11 && piece == val22) {
                    return true;
                }

                if (piece == val02 && piece == val11 && piece == val20) {
                    return true;
                }

                return false;
    }
}