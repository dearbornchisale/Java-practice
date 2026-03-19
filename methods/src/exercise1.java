import java.util.Scanner;

public class exercise1 {
    public static boolean isValidNumber(String ans) {
        
        if(ans == null || ans.isEmpty()){
            return false; 
        }
        if (!ans.matches("[0-9]+")) {
            return false ;
        }
        
        int num = Integer.parseInt(ans);
        return num >= 1 && num <= 1000;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number (1-1000): ");
        String ans = input.next();

        boolean num = isValidNumber(ans);

        if (num == true) {
            System.out.println("Valid Number ");
        } else {
            System.out.println("Invalid Number ");

        }

    }

}
