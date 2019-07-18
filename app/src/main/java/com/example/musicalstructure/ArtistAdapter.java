package com.example.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<String> {
    private static final int SONG_SELECTION_METHOD_ARTIST = 200;
    public ArtistAdapter (Context context, ArrayList<String> artistNames){
        super(context, 0, artistNames);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_list_item, parent, false);
        }

        String artistName = getItem(position);

        listItemView.setOnClickListener(new SongParameterClickListener(artistName,getContext(),SONG_SELECTION_METHOD_ARTIST));

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_list_item_artist_name);

        artistTextView.setText(artistName);
        return listItemView;
    }
}
