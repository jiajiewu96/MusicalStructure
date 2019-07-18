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

        AlbumAdapter albumAdapter = new AlbumAdapter(this, songs);

        ListView listView = findViewById(R.id.album_list);
        listView.setAdapter(albumAdapter);
    }
}
