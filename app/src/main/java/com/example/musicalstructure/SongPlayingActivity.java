package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SongPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_playing);

        TextView songNameTextView = (TextView) findViewById(R.id.song_playing_song_name);
        TextView songArtistTextView = (TextView) findViewById(R.id.song_playing_artist_name);
        TextView songAlbumTextView = (TextView) findViewById(R.id.song_playing_album_name);



    }
}
