package com.example.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Song> {
    public AlbumAdapter(Context context, ArrayList<Song> songs){
        super(context,0, songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_list_item, parent, false);
        }
        Song song = getItem(position);

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_list_album_name);
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.album_list_artist_name);

        albumTextView.setText(song.getmAlbumName());
        artistTextView.setText(song.getArtistName());

        return super.getView(position, convertView, parent);
    }
}
