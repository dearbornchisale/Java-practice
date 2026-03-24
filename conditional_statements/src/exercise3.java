import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current account balance:R ");
        double balance = input.nextDouble();

        System.out.print("Enter amout to withdrawl:R ");
        double requestAmount = input.nextDouble();

        double accountBalnce = balance - requestAmount;

        if (requestAmount > 500) {
            System.out.println("Denied: Above maximum ");
        } else if (requestAmount < 20) {
            System.out.println("Denied: Below minimum ");
        } else if (requestAmount % 10 != 0) {
            System.out.println("Denied: Not a multiple of 10");
        } else if (accountBalnce < requestAmount + 10) {
            System.out.println("Denied: Insufficient Balance (needs R10 remaining) ");
        } else {
            System.out.println("Approved:R  " + requestAmount + " withdrawn.New balance:R " + accountBalnce);
        }
    }
}
