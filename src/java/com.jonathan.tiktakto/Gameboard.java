package com.jonathan.tiktakto;

public class Gameboard {

    private int[][] board;

    public Gameboard() {
        this.board = new int[3][3];

        this.setElements(0, 0, Pieces.Empty);
        this.setElements(0, 1, Pieces.Empty);
        this.setElements(0, 2, Pieces.Empty);
        this.setElements(1, 0, Pieces.Empty);
        this.setElements(1, 1, Pieces.Empty);
        this.setElements(1, 2, Pieces.Empty);
        this.setElements(2, 0, Pieces.Empty);
        this.setElements(2, 1, Pieces.Empty);
        this.setElements(2, 2, Pieces.Empty);



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

        Pieces val00 = this.getElement(0, 0);
        Pieces val01 = this.getElement(0, 1);
        Pieces val02 = this.getElement(0, 2);
        Pieces val10 = this.getElement(1, 0);
        Pieces val11 = this.getElement(1, 1);
        Pieces val12 = this.getElement(1, 2);
        Pieces val20 = this.getElement(2, 0);
        Pieces val21 = this.getElement(2, 1);
        Pieces val22 = this.getElement(2, 2);

        if(piece == val00 && piece == val11 && piece == val22) {
            return true;
        }

        if(piece == val01 && piece == val12 && piece == val20) {
            return true;
        }

        if(piece == val00 && piece == val01 && piece == val02) {
            return true;
        }

        if(piece == val10 && piece == val11 && piece == val12) {
            return true;
        }

        if(piece == val20 && piece == val21 && piece == val22) {
            return true;
        }

        if(piece == val00 && piece == val10 && piece == val20) {
            return true;
        }

        if(piece == val01 && piece == val11 && piece == val21) {
            return true;
        }

        if(piece == val02 && piece == val12 && piece == val22) {
            return true;
        }

        return false;
    }
}
