import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class exercise1 {
    public static ArrayList<String> createPlaylist() {
        Scanner input = new Scanner(System.in);

        ArrayList<String> songs = new ArrayList<>();
        boolean option = true;

        while (option) {
            System.out.print("Enter a song title: ");
            String title = input.nextLine();

            songs.add(title);

            System.out.print("Type 'done' to finish: ");
            String exit = input.next().toUpperCase();
            input.nextLine();

            if (exit.equalsIgnoreCase("DONE")) {
                option = false;
                break;
            }
        }

        return songs;
    }

    public static void displayPlaylist(ArrayList<String> songs, String playListName) {
        System.out.println("Heavy Rotation: ");

        for (int i = 0; i < songs.size(); i++) {
            System.out.println(i + 1 + ". " + songs.get(i));
        }

        System.out.println("Total songs: " + songs.size());
    }

    public static void moveSong(ArrayList<String> songs, int currentPosition, int newPosition) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter position to move: ");
        currentPosition = input.nextInt();

        int idx1 = currentPosition - 1; 
        
        System.out.print("Enter new position: ");
        newPosition = input.nextInt();

        int idx2 = newPosition - 1; 

        songs.add(idx2, songs.remove(idx1));

        System.out.print("After moving; ");

        displayPlaylist(songs, "Heavy Rotation");
    }

    public static void main(String[] args) {
        ArrayList<String> songList = createPlaylist();

        displayPlaylist(songList, "Heavy Rotation");

        moveSong(songList, 0, 0);

    }
}
