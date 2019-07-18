package com.example.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter<Song> {

    public SongListAdapter (Context context, ArrayList<Song> songs){
        super(context, 0, songs);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, parent, false);
        }

        Song song = getItem(position);

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_list_song_text_view);
        TextView songAlbumTextView = (TextView) listItemView.findViewById(R.id.song_list_album_text_view);
        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.song_list_artist_text_view);

        songNameTextView.setText(song.getSongName());
        songAlbumTextView.setText(song.getAlbumName());
        songArtistTextView.setText(song.getArtistName());

        return listItemView;
    }
}
