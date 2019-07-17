package com.example.musicalstructure;

import java.util.ArrayList;

public class SongDataManager {

    private static ArrayList<Song> songs;
    private static final SongDataManager ourInstance = new SongDataManager();

    public static SongDataManager getInstance() {
        return ourInstance;
    }

    private static ArrayList<Song> createDummySongs(){
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Go Apart", "Abbey Street", "The Bugs"));
        songs.add(new Song("Here Comes The Moon", "Abbey Street", "The Bugs"));
        songs.add(new Song("The Start", "Abbey Street", "The Bugs"));
        songs.add(new Song("Purple Battlecruiser", "Purple Battlecruiser", "The Bugs"));
        songs.add(new Song("All You Need Is Sleep", "Purple Battlecruiser", "The Bugs"));
        songs.add(new Song("All Apart Soon", "Purple Battlecruiser", "The Bugs"));
        songs.add(new Song("Large Topped Boys", "Rock", "King"));
        songs.add(new Song("Car Race", "Rock", "King"));
        songs.add(new Song("Please Stop That Man", "Rock","King"));
        songs.add(new Song("Another One Eats The Dust", "The Play", "King"));
        songs.add(new Song("Save Her", "The Play", "King"));
        return songs;
    }

    private SongDataManager() {
        songs = new ArrayList<>();
        songs = createDummySongs();
    }

    public ArrayList<Song> getSongs(){
        return songs;
    }
}
