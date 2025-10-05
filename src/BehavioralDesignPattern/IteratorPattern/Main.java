package BehavioralDesignPattern.IteratorPattern;

public class Main {
    public static void main(String[] args){
      Playlist playlist = new Playlist();

      playlist.addSong("song1");
      playlist.addSong("song2");
      playlist.addSong("song3");

      System.out.println("Simple playlist");
      PlaylistIterator simplePlaylist = playlist.iterator("simple");
      while(simplePlaylist.hasNext()){
          System.out.println(simplePlaylist.next());
      }

      System.out.println("Shuffled playlist");
      PlaylistIterator shuffledPlaylist = playlist.iterator("shuffled");
      while(shuffledPlaylist.hasNext()){
          System.out.println(shuffledPlaylist.next());
      }

    }
}
