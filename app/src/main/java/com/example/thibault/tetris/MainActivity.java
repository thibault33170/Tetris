package com.example.thibault.tetris;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Piece> pieces;
    private int[][] grid = new int[10][8];
    private ImageAdapter adapter;
    private PieceFactory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieces = new ArrayList<Piece>();
        this.adapter = new ImageAdapter(this);
        this.factory = new PieceFactory();

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(adapter);

        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                jouer();
                update();
                handler.postDelayed(this, 2500);
            }
        };
        handler.post(runnable);
    }

    private void jouer() {
        Piece piece = this.factory.generatePiece();
        this.pieces.add(piece);
    }

    private void update() {
        Piece p = this.getLastPiece();
        if (p != null) {
            Log.i("ti", "dmfovuouvdfmouuedvoou");
            p.down();
            this.adapter.update(this.pieces);
        }
    }

    private Piece getLastPiece () {
        if(this.pieces.isEmpty()) {
            return null;
        }

        return this.pieces.get(this.pieces.size() - 1);
    }
}
