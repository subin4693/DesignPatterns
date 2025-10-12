package BehavioralDesignPattern.IteratorPattern;

import java.util.ArrayList;

public class Playlist {
    ArrayList<String> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public PlaylistIterator iterator(String type) {
        switch (type) {
            case "simple":
                return new SimplePlaylistIterator(this);
            case "shuffled":
                return new ShuffledPlaylistIterator(this);
            default:
                return null;
        }
    }

    public ArrayList<String> getSongs() {
        return songs;
    }
}
