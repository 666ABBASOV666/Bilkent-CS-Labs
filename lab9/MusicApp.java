import java.util.ArrayList;
import java.util.Scanner;
public class MusicApp {
    public static void main (String [] args) {

        int choice = 0;
        String artist = "";
        String album = "";
        String title = "";
        int duration = 0;
        int timesPlayed = 0;
        String playlistName = "";
        String creatorOfPlaylist = "";
        String genreChooser = "";
        

        ArrayList<Song> songs = new ArrayList<Song>();
        Scanner sc = new Scanner (System.in);
       // Song song = new Song(title, artist, album, duration, timesPlayed);
        Playlist playlist = new Playlist(playlistName, creatorOfPlaylist, genreChooser, songs);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Music App! Get Ready to create your playlist!");
        System.out.println("--------------------------------------------------------");

        while (choice != 6) {
        System.out.println(
            "1 - Create a new Playlist" + "\n" +
            "2 - Display the Playlist" + "\n" +
            "3 - Sort the Playlist" + "\n" +
            "4 - Remove song by index from the current Playlist" + "\n" +
            "5 - Display all Playlists" + "\n" +
            "6 - Exit" + "\n"); 

        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("How many songs do you want to add to playlist?: ");
        

        int countOfSongs = sc.nextInt();

        for(int i = 1; i <= countOfSongs; i++) {

            System.out.println("Enter artist name for Song " + i);
            sc.nextLine();
            artist = sc.nextLine();
            System.out.println("Enter album name for Song " + i);
            album = sc.nextLine();

            System.out.println("Enter song name for Song " + i);
            title = sc.nextLine();

            System.out.println("Enter song duration in seconds for Song " + i);
            duration = sc.nextInt();

            System.out.println("Enter the times song has been played for Song " + i);
            timesPlayed = sc.nextInt();
            
            Song song = new Song(title, artist, album, duration, timesPlayed);
            
            if(i == countOfSongs) {
                System.out.println("Enter playlist name: ");
                sc.nextLine();
                playlistName = sc.nextLine();

                System.out.println("Enter creator of playlist ");
                creatorOfPlaylist = sc.nextLine();

                System.out.println("0-Country" + "\n" +
                "1-Electronic" + "\n" +
                "2-Pop Music" + "\n" +
                "3-Rock Music" + "\n" +
                "4-Jazz" + "\n" +
                "5-Classical" + "\n" +
                "Select genre of playlist : " + "\n");
                genreChooser = sc.nextLine();

                if (genreChooser == "0") {
                    genreChooser = "Country";
                }
                else if (genreChooser == "1") {
                    genreChooser = "Electronic";
                }
                else if (genreChooser == "2") {
                    genreChooser = "Pop Music";
                }
                else if (genreChooser == "3") {
                    genreChooser = "Rock Music";
                }
                else if (genreChooser == "4") {
                    genreChooser = "Jazz";
                }
                else if (genreChooser == "5") {
                    genreChooser = "Classical";
                }
                else {
                }

                playlist = new Playlist(playlistName, creatorOfPlaylist, genreChooser, songs);
                System.out.println(playlist);
            }
        }
        }

        if (choice == 2) {
            System.out.println("Displaying the playlist:" + genreChooser);
            System.out.println("Playlist name: " + playlist.getName());
            System.out.println("Creator name: " + playlist.getCreator());
            System.out.println("Genre: " + playlist.getGenre());
            System.out.println(songs);
        }

        if (choice == 3) {
            playlist.sortByDurationDesc();
            System.out.println(playlist);
        }

        if (choice == 4) {
            System.out.println("Index number: ");
            int index = sc.nextInt();
            playlist.removeSong(index);

        }

        if (choice == 5) {
            System.out.println(playlist);
        }
    }
    sc.close();  
    }
}