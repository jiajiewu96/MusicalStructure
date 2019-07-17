package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    SongDataManager songDataManager = SongDataManager.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);


        ArrayList<Song> songs = songDataManager.getSongs();


    }
}
