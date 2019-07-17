package com.example.musicalstructure;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Song> {
    public AlbumAdapter(Context context, ArrayList<Song> songs){
        super(context,0, songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
