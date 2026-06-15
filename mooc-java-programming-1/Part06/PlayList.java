import java.util.ArrayList;

public class PlayList  {
    private ArrayList<String> songs;


    pulic PlayList() {
        this.songs = new ArrayList<>(); // create songs variable of type ArrayList
    }

    public void adddSong(String songName) {
        this.songs.add(songName);
    }

    public void removeSong(String songName) {
        if (this.songs.contains(songName)) {
            this.songs.remove(songName);
        } esle {
            System.out.println("No song");
        }
    }

    public String toString() {
        for (String songItem : this.songs) {
            System.out.println("Song name " + songItem); // this can be better using a class Song
        }
    }
}
