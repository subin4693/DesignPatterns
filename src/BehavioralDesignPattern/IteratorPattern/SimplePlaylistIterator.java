package BehavioralDesignPattern.IteratorPattern;

import java.util.ArrayList;

public class SimplePlaylistIterator implements PlaylistIterator{

    private Playlist playlist;
    private int index;

    public SimplePlaylistIterator(Playlist playlist){
        this.playlist = playlist;

    }

    @Override
    public boolean hasNext(){
        return index < playlist.getSongs().size();
    }


    @Override
    public String next(){
        ArrayList<String> arr = playlist.getSongs();

        return arr.get(index++);
    }
}
