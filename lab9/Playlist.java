import java.util.ArrayList;

public class Playlist {

    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs;
    private Song song;
    private boolean songExists = true;
    private String addSong;

    public Playlist (String sName, String sCreator, String sGenre, ArrayList<Song> sSongs) {
        
        this.name = sName;
        this.creator = sCreator;
        this.genre = sGenre;
        this.songs = sSongs;
    }


    //getters

    public Playlist() {

    }


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

    //setters

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

    public void addSong (ArrayList<Song> songs) {
        if (Songs.contains(songs)) {

        }
        else {
            this.songs = songs;
        }
    }

    public void removeSong (Song a) {
        songs.remove(a);
    }

    public void sortByDurationDesc () {

    }

    public String toString () {
        return "--------------------------------------------------------"
        + "\n" + "Playlist Name: " + name
        + "\n" + "Creator Name: " + creator 
        + "\n" + "Genre: " + genre
        + "\n" + song;
    }
}