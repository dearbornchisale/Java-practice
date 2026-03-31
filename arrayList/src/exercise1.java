import java.util.ArrayList;
import java.util.Scanner;

public class exercise1 {
     public static ArrayList<String> createPlaylist(){
        Scanner input = new Scanner(System.in);

        ArrayList <String> songs = new ArrayList<>();
        String option = "done";

        while(option.equalsIgnoreCase("done")){
            System.out.print("Enter a song title: ");
            String title = input.nextLine();

            songs.add(title);

            System.out.print("Type 'done' if you are finished: ");
            option = input.nextLine().toLowerCase();
        }

        return songs; 
    }
    public static void main(String[] args) {
      createPlaylist();
    }
}
