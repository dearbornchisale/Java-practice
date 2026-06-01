import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class LiknedHashSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set <String> userName = new LinkedHashSet<>();

        boolean running  = true; 

        while(running){
            System.out.print("Enter your user name: ");
            String name = input.next();

            userName.add(name);

            System.out.print("Do you still have a name to enter: ");
            String ans = input.next();

            if(ans.equalsIgnoreCase("No")){
                running = false;
            }
        }

        System.out.println(userName);

        input.close();
    }
}
