package com.example.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<String> {
    private ArrayList<String> albumNames;
    private ArrayList<String> artistNames;

    public AlbumAdapter(Context context, ArrayList<String> albumName, ArrayList<String> artistNames){
        super(context,0, albumName);
        this.albumNames = albumName;
        this.artistNames = artistNames;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_list_item, parent, false);
        }

        String albumName = albumNames.get(position);
        String artistName = artistNames.get(position);

        listItemView.setOnClickListener(new SongParameterClickListener(albumName,getContext()));

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_list_album_name);
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.album_list_artist_name);


        albumTextView.setText(albumName);
        artistTextView.setText(artistName);

        return listItemView;
    }
}
