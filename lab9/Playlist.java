import java.util.ArrayList;
import java.util.Collections;

public class Playlist {

    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs;
    private Song song;

    public Playlist (String sName, String sCreator, String sGenre, ArrayList<Song> sSongs) {
        
        this.name = sName;
        this.creator = sCreator;
        this.genre = sGenre;
        this.songs = sSongs;
    }


    //getters



    public String getName () {
        return name;
    }

    public String getCreator () {
        return creator;
    }

    public String getGenre () {
        return genre;
    }

    public void getSongs () {
        System.out.println(songs);
    } 

    public void setName (String a) {
        this.name = a;
    }

    public void setCreator (String a) {
        this.creator = a;
    }

    public void setGenre (String a) {
        this.genre = a;
    }

    public void setSongs (ArrayList<Song> songs) {
        this.songs = songs;
    }

    public boolean songExists (Song song) {
        for(int i = 0; i < songs.size(); i++) {
        if (songs.get(i).equals(song)) {
            return true;
        } 
    }
    return false;
}

    public void addSong (Song song) {
        if (songExists(song) == false) {
            songs.add(song);
        }
    }

    public void removeSong (Song a) {
        songs.remove(a);
    }

    public void removeSong (int index) {
        songs.remove(songs.get(index));
    }

    public void sortByDurationDesc () {
        Collections.sort(songs);
    }

    public String toString () {
        return "--------------------------------------------------------"
        + "\n" + "Playlist Name: " + name
        + "\n" + "Creator Name: " + creator 
        + "\n" + "Genre: " + genre
        + "\n" + song;
    }
}