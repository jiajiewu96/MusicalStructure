package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    SongDataManager songDataManager = SongDataManager.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ArrayList<Song> songs = songDataManager.getSongs();
        ArrayList<String> albumNames = new ArrayList<>();
        ArrayList<String> artistNames = new ArrayList<>();

        //add initial albums
        albumNames.add(songs.get(0).getAlbumName());
        artistNames.add(songs.get(0).getArtistName());

        String previousAlbumName = songs.get(0).getAlbumName();
        //Checks through song arraylist if the album is
        for(Song song: songs){
            if(!previousAlbumName.equals(song.getAlbumName())){
                albumNames.add(song.getAlbumName());
                artistNames.add(song.getArtistName());
                previousAlbumName = song.getAlbumName();
            }
        }

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumNames, artistNames);

        ListView listView = findViewById(R.id.album_list);
        listView.setAdapter(albumAdapter);
    }
}
