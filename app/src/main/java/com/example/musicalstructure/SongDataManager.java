package com.example.musicalstructure;

import java.util.ArrayList;

public class SongDataManager {

    private static ArrayList<Song> songs = new ArrayList<>();
    private static final SongDataManager ourInstance = new SongDataManager();
    private final int SELECTION_ALBUMS = 100;
    private final int SELECTION_ARTISTS = 200;

    public static SongDataManager getInstance() {
        return ourInstance;
    }

    private static ArrayList<Song> createDummySongs() {
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Go Apart", "Abbey Street", "The Bugs"));
        songs.add(new Song("Here Comes The Moon", "Abbey Street", "The Bugs"));
        songs.add(new Song("The Start", "Abbey Street", "The Bugs"));
        songs.add(new Song("Purple Battlecruiser", "Purple Battlecruiser", "The Bugs"));
        songs.add(new Song("All You Need Is Sleep", "Purple Battlecruiser", "The Bugs"));
        songs.add(new Song("All Apart Soon", "Purple Battlecruiser", "The Bugs"));
        songs.add(new Song("Large Topped Boys", "Rock", "King"));
        songs.add(new Song("Car Race", "Rock", "King"));
        songs.add(new Song("Please Stop That Man", "Rock", "King"));
        songs.add(new Song("Another One Eats The Dust", "The Play", "King"));
        songs.add(new Song("Save Her", "The Play", "King"));
        return songs;
    }

    private SongDataManager() {
        songs = createDummySongs();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public ArrayList<Song> getSongsFor(String songSelector, int selectionMethod){
        ArrayList<Song> songsMatching = new ArrayList<>();
        switch (selectionMethod){
            case SELECTION_ALBUMS:
                songsMatching = getSongsForAlbum(songSelector);
                break;
            case SELECTION_ARTISTS:
                songsMatching = getSongsForArtist(songSelector);
        }
        return songsMatching;
    }

    private ArrayList<Song> getSongsForArtist(String songSelector) {
        ArrayList<Song> songsForArtist = new ArrayList<>();
        for(Song song:songs){
            if(song.getArtistName().equals(songSelector)){
                songsForArtist.add(song);
            }
        }
        return songsForArtist;
    }

    private ArrayList<Song> getSongsForAlbum(String songSelector) {
        ArrayList<Song> songsInAlbum = new ArrayList<>();
        for(Song song:songs){
            if(song.getAlbumName().equals(songSelector)){
                songsInAlbum.add(song);
            }
        }
        return songsInAlbum;
    }
}
