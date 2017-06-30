package com.example.thibault.tetris;

public class Piece_T extends Piece {

    public Piece_T() {
        this.hauteur = 2;
        this.largeur = 3;
        int[][] matrice = {{1,1,1},{0,1,0}};
        this.setMatrice(matrice);
        this.pos_i = 0;
        this.pos_j = 0;
        this.color = R.drawable.yellow;
    }
}
