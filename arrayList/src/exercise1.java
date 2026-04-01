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

        int idx1 = currentPosition - 1;

        int idx2 = newPosition - 1;

        songs.add(idx2, songs.remove(idx1));

    }

    public static ArrayList<String> searchSongs(ArrayList<String> songs, String keyword) {

        ArrayList<String> titleKeyword = new ArrayList<>();

        for (String songTitle : songs) {
            if (songTitle.contains(keyword)) {
                titleKeyword.add(songTitle);
            }
        }

        return titleKeyword;

    }

    public static void removeDuplicates(ArrayList<String> songs) {
        ArrayList<String> uniqueSongs = new ArrayList<>();

        for (String song : songs) {
            if (!uniqueSongs.contains(song)) {
                uniqueSongs.add(song);
            }
        }

        songs.clear();
        songs.addAll(uniqueSongs);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> songList = createPlaylist();

        displayPlaylist(songList, "Heavy Rotation");

        System.out.print("Enter position to move: ");
        int currentPosition = input.nextInt();

        System.out.print("Enter new position: ");
        int newPosition = input.nextInt();

        System.out.println("After moving; ");

        moveSong(songList, currentPosition, newPosition);

        displayPlaylist(songList, "Heavy Rotation");

        System.out.print("Enter keyword to search: ");
        String keyword = input.next();

        System.out.println("Songs found: ");

        searchSongs(songList, keyword);

        ArrayList<String> searchedPlaylist = searchSongs(songList, keyword);

        displayPlaylist(searchedPlaylist, keyword);

        removeDuplicates(songList);

        System.out.println("After removing duplicates: ");

        displayPlaylist(songList, "Heavy Rotation");

    }
}
