import java.util.ArrayList;
import java.util.Scanner;
public class MusicApp {
    public static void main (String [] args) {

        String artist;
        String album;
        String song;
        int duration;
        int timesPlayed;
        Playlist Playlist;

        ArrayList<Song> songs = new ArrayList<Song>();
        Scanner sc = new Scanner (System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Music App! Get Ready to create your playlist!");
        System.out.println("--------------------------------------------------------");
        System.out.println(
            "1 - Create a new Playlist" + "\n" +
            "2 - Display the Playlist" + "\n" +
            "3 - Sort the Playlist" + "\n" +
            "4 - Remove song by index from the current Playlist" + "\n" +
            "5 - Display all Playlists" + "\n" +
            "6 - Exit" + "\n"); 

        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("How many songs do you want to add to playlist?: ");
        }

        int countOfSongs = sc.nextInt();

        for(int i = 0; i < countOfSongs; i++) {
            System.out.println("Enter artist name for Song " + i);
            artist = sc.nextLine();

            System.out.println("Enter album name for Song " + i);
            album = sc.nextLine();

            System.out.println("Enter song name for Song " + i);
            song = sc.nextLine();

            System.out.println("Enter song duration in seconds for Song " + i);
            duration = sc.nextInt();

            System.out.println("Enter the times song has been played for Song " + i);
            timesPlayed = sc.nextInt();

        }
        Playlist pplaylist = new Playlist();

        Song ssong = new Song();
        

        

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
        /*
    Song song = new Song("Test", "artist1", "Red", 347, 10000000);
    System.out.println(song);

    Song song1 = new Song("Test", "artist1", "Red", 600, 10000000);
    Song song2 = new Song("Test2", "artist2", "Red2", 106, 23555);
    System.out.println(song); 

    songs.add(song1);
    songs.add(song2);
    Playlist playlist = new Playlist("Red Season","Taylor Swift","Fall Songs", songs);
    System.out.println(playlist);*/


    }
}