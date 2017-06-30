package com.example.thibault.tetris;

abstract class Piece implements Mouvement {

    protected int hauteur;

    protected int largeur;

    protected int[][] matrice;

    protected int pos_i;

    protected int pos_j;

    protected int color;


    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int[][] getMatrice() {
        return matrice;
    }

    public void setMatrice(int[][] matrice) {
        this.matrice = matrice;
    }

    public int getPos_i() {
        return pos_i;
    }

    public void setPos_i(int pos_i) {
        this.pos_i = pos_i;
    }

    public int getPos_j() {
        return pos_j;
    }

    public void setPos_j(int pos_j) {
        this.pos_j = pos_j;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public void left() {
        setPos_j(getPos_j() - 1);
    }

    @Override
    public void right() {
        setPos_j(getPos_j() + 1);
    }

    @Override
    public void down() {
        setPos_i(getPos_i() + 1);
    }

    @Override
    public void rotate() {

    }
}
