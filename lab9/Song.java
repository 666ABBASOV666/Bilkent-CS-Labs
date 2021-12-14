public class Song {

    private String title;
    private String artist;
    private String album;
    private int duration;
    private int timesPlayed;


    public Song (String sTitle, String sArtist, String sAlbum, int sDuration, int sTimesPlayed) {
        this.title = sTitle;
        this.artist = sArtist;
        this.album = sAlbum;
        this.duration = sDuration;
        this.timesPlayed = sTimesPlayed;
    }

        //getters

    public String getTitle () {
        return title;
    }

    public String getArtist () {
        return artist;
    }

    public String getAlbum () {
        return album;
    }

    public int getDuration () {
        return duration;
    }

    public int getTimesPlayed () {
        return timesPlayed;
    }

    //Setters

    public void setTitle (String a) {
        this.title = a;
    }

    public void setArtist (String a) {
        this.artist = a;
    }

    public void setAlbum (String a) {
        this.album = a;
    }

    public void setDuration (int a) {
        this.duration = a;
    }

    public void setTimesPlayed (int a) {
        this.timesPlayed = a;
    }

    public String toString () {
        return "*************************************************" + 
        "\n" + "Song Name: " + title +
        "\n" + "Artist Name: " + artist +
        "\n" + "Album Name: " + album +
        "\n" + "Duration: " + duration +
        "\n" + "Times Played: " + timesPlayed +
        "\n";
    }





    

}