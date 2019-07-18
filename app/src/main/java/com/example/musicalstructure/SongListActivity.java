package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongListActivity extends AppCompatActivity {
    SongDataManager songDataManager = SongDataManager.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        Bundle extras = getIntent().getExtras();
        ArrayList<Song> songs;
        String songSelector = "";
        int selectionMethod = 0;
        if(extras != null){
            songSelector = extras.getString("sort_string");
            selectionMethod = extras.getInt("selection_method");
        }
        if(selectionMethod > 0 && !songSelector.equals("")){
            songs = songDataManager.getSongsFor(songSelector, selectionMethod);
        }else{
            songs = songDataManager.getSongs();
        }

        SongListAdapter songListAdapter = new SongListAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(songListAdapter);
    }
}
