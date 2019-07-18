package com.example.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class SelectedSongClickListener implements View.OnClickListener{
    private Song selectedSong;
    private Context context;
    public SelectedSongClickListener(Context context, Song song){
        this.selectedSong = song;
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, SongPlayingActivity.class);
        intent.putExtra("song_name", selectedSong.getSongName());
        intent.putExtra("song_artist", selectedSong.getArtistName());
        intent.putExtra("song_album", selectedSong.getAlbumName());
        context.startActivity(intent);
    }
}
