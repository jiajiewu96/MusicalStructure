package com.example.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class SongParameterClickListener implements View.OnClickListener {
    private final String songSort;
    private final Context context;
    private final int selectionMethod;
    public SongParameterClickListener(String songSort, Context context, int selectionMethod){
        this.songSort = songSort;
        this.context = context;
        this.selectionMethod = selectionMethod;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, SongListActivity.class);
        intent.putExtra("sort_string", songSort);
        intent.putExtra("selection_method", selectionMethod);
        context.startActivity(intent);
    }
}
