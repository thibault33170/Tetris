package com.example.thibault.tetris;

public class Piece_O extends Piece {

    public Piece_O() {
        this.hauteur = 2;
        this.largeur = 2;
        int[][] matrice = {{1,1},{1,1}};
        this.setMatrice(matrice);
        this.pos_i = 0;
        this.pos_j = 0;
        this.color = R.drawable.purple;
    }
}
