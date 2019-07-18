package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {
    SongDataManager songDataManager = SongDataManager.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        ArrayList<Song> songs = songDataManager.getSongs();
        ArrayList<String> artistNames = new ArrayList<>();

        //add initial artist name
        artistNames.add(songs.get(0).getArtistName());

        String previousArtistName = songs.get(0).getArtistName();
        //Checks through song arraylist if the album is
        for(Song song: songs){
            if(!previousArtistName.equals(song.getArtistName())){
                artistNames.add(song.getArtistName());
                previousArtistName = song.getArtistName();
            }
        }

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistNames);

        ListView listView = findViewById(R.id.artist_list_view);
        listView.setAdapter(artistAdapter);
    }
}
