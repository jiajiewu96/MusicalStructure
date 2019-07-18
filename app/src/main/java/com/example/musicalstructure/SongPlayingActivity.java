package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SongPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_playing);

        String songName = "";
        String songArtist = "";
        String songAlbum = "";

        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            songName = extras.getString("song_name");
            songArtist = extras.getString("song_artist");
            songAlbum = extras.getString("song_album");
        }

        TextView songNameTextView = (TextView) findViewById(R.id.song_playing_song_name);
        TextView songArtistTextView = (TextView) findViewById(R.id.song_playing_artist_name);
        TextView songAlbumTextView = (TextView) findViewById(R.id.song_playing_album_name);

        songNameTextView.setText(songName);
        songArtistTextView.setText(songArtist);
        songAlbumTextView.setText(songAlbum);

    }
}
