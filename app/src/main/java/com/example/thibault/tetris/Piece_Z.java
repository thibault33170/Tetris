package com.example.thibault.tetris;

public class Piece_Z extends Piece {

    public Piece_Z() {
        this.hauteur = 2;
        this.largeur = 3;
        int[][] matrice = {{1,1,0},{0,1,1}};
        this.setMatrice(matrice);
        this.pos_i = 0;
        this.pos_j = 0;
        this.color = R.drawable.green;
    }
}
