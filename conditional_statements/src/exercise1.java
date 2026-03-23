import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int discount = 8;
        int finalPrice = 0;

        System.out.print("How old are you : ");
        int age = input.nextInt();

        System.out.print("Are you a student 'Yes/No':  " );
        String ans = input.next().toUpperCase();

        if(age < 12){

            System.out.println("Your ticket will be:$ " + 8);

        }else if (age >= 12 && age <= 64){

            int ticketPrice = 12; 

            if( ans.equalsIgnoreCase("Yes")){
                finalPrice = ticketPrice - discount;
                System.out.println("Your ticket will be:$ " + finalPrice);
            }

        }else{
          finalPrice = 10 - discount;
            System.out.println("Your ticket will be:$ " + finalPrice);
   
        }
         
    }
}
