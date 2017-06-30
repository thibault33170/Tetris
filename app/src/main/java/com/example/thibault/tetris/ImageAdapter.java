package com.example.thibault.tetris;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Integer> mArrayList;
    private Integer nbLines = 10;
    private Integer nbColumns = 8;

    public ImageAdapter(Context c) {
        mContext = c;
        initGrid();
    }

    private void initGrid() {
        this.mArrayList = new ArrayList<>();

        for (int i = 0; i < this.nbLines; i++) {
            for (int j = 0; j < this.nbColumns; j++) {
                this.mArrayList.add(R.drawable.black);
            }
        }
    }

    public int getCount() {
        return mArrayList.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(160, 160));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(this.mArrayList.get(position));
        return imageView;
    }

    public void update(ArrayList<Piece> al) {
        for (Piece ip : al) {
            Piece p = ip;

            for (int i =  p.getPos_i(); i < p.getPos_i() + p.getLargeur(); i++ ) {
                for (int j =  p.getPos_j(); j < p.getPos_j() + p.getHauteur(); j++ ) {
                    int index = i * this.nbColumns + j;
                    this.mArrayList.set(index, p.getColor());
                }
            }
        }
        notifyDataSetChanged();
    }
}