package com.example.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class SongParameterClickListener implements View.OnClickListener {
    private final String songSort;
    private final Context context;
    public SongParameterClickListener(String songSort, Context context){
        this.songSort = songSort;
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, SongListActivity.class);
        intent.putExtra("sort_string", songSort);
        context.startActivity(intent);
    }
}
