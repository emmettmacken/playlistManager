import java.util.Scanner;

public class PlaylistTest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n==== Music Playlist Manager ====");
            System.out.println("        Choose an option :      ");
            System.out.println("          1. Add a song         ");
            System.out.println("        2. View playlist        ");
            System.out.println("        3. Remove a song        ");
            System.out.println("            4. Exit             ");
            System.out.println("_________________________________");

            System.out.print("\nYour choice: ");
            int input = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (input) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter duration (in minutes): ");
                    double duration = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    Song song = new Song(title, artist, duration);
                    playlist.addSong(song);
                    break;
                case 2:
                    playlist.displaySongs();
                    break;
                case 3:
                    System.out.print("Enter song title to remove: ");
                    String removeTitle = scanner.nextLine();
                    playlist.removeSong(removeTitle);
                    break;
                case 4:
                    System.out.println("\nExiting...");
                    scanner.close();
                    return;

                    default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}