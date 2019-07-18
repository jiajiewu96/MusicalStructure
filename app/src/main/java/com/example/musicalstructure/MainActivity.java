package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SongDataManager sdm = SongDataManager.getInstance();

        TextView albumSelectorTextView = (TextView) findViewById(R.id.album_selector_text_view);
        TextView artistSelectorTextView = (TextView) findViewById(R.id.artitst_selector_text_view);
        TextView songSelectorTextView = (TextView) findViewById(R.id.song_selector_text_view);

        albumSelectorTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Startup album activity
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(intent);

            }
        });
        artistSelectorTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Startup artist activity
            }
        });
        songSelectorTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Startup song activity
            }
        });

    }
}
