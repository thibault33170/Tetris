package com.example.thibault.tetris;

import android.graphics.Color;

public class Piece_I extends Piece implements IPiece{


    public Piece_I () {
        this.hauteur = 1;
        this.largeur = 4;
        int [][] matrice = {{1,1,1,1}};
        this.setMatrice(matrice);
        this.pos_i = 0;
        this.pos_j = 0;
        this.color = R.drawable.blue;
    }
}