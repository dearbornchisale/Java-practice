import java.util.Scanner;

public class exercise1 {
    public static boolean isValidNumber(String ans) {
        
       if (ans.length() > 0 && ans == null){
           return true;
        }

        if (ans.matches("[0-9]+")) {
            return true;
        }
        
        int num = Integer.parseInt(ans);

        if (num >= 1 && num <= 1000) {
            return true;
        } else {
            return false;
        }

    

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number (1-1000): ");
        String ans = input.next();

        boolean num = isValidNumber(ans);

        if( num == true ){
            System.out.println("Valid Number ");
        }else{
              System.out.println("Invalid Number ");

        }

    }

}
