package com.example.thibault.tetris;

import java.util.Random;

public class PieceFactory {
    PieceFactory() {}

    Piece generatePiece() {
        Random rand = new Random();
        int randomNum = rand.nextInt((5 - 1) + 1) + 1;

        switch (randomNum) {
            case 1:
                return new Piece_I();
            case 2:
                return new Piece_L();
            case 3:
                return new Piece_O();
            case 4:
                return new Piece_T();
            case 5:
                return new Piece_Z();
            default:
                return new Piece_I();
        }
    }
}
