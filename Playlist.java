import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> songs; //a list of song objects

    //constructor
    public Playlist() {
        this.songs = new ArrayList<>();
    }

    //method to add a song to the playlist
    public void addSong(Song song) {
        songs.add(song); //adds the provided song to the songs list
        System.out.println("\nAdded: " + song.getTitle());
    }

    //method to remove a song by its title
    public void removeSong(String title) {
        for (int i = 0; i < songs.size(); i++) //loops through each song in the list
        {
            if (songs.get(i).getTitle().equalsIgnoreCase(title)) /*retrieves the song at index i and
            compares two strings ignoring case differences */
            {
                System.out.println("Removed: " + songs.get(i).getTitle());
                songs.remove(i); //removes song at index i
                return;
            }
        }
        System.out.println("Song not found" + title);
    }

    //method to display all songs within the playlist
    public void displaySongs() {
        if (songs.isEmpty()) {
            System.out.println("There are no songs in your playlist");
        } else {
            System.out.println("Playlist:");
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }
}
