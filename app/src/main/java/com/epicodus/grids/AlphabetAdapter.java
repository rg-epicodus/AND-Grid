package com.epicodus.grids;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by OIG on 10/11/2017.
 */

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;
    private Typeface mTypeface;

    public AlphabetAdapter(Context context, String[] letters, Typeface typeface) {
        this.mContext = context;
        this.mLetters = letters;
        this.mTypeface = typeface;
    }


    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);

            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);

            letterView.setText(mLetters[position]);
            letterView.setTypeface(mTypeface);
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }


}