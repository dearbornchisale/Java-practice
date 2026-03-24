import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = input.nextInt();

        System.out.print("Enter the month: ");
        int month = input.nextInt();

        while (month < 1 || month > 12) {
            System.out.print("Invalid month. Please enter a valid month: ");
            month = input.nextInt();
        }

        boolean isLeap = (year % 400 == 0 && year % 100 != 0) || (year % 4 == 0);

        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                if (isLeap) {
                    days = 29;

                } else {
                    days = 28;
                }
                break;

        }

        System.out.println("The year was: " + year);
        System.out.println("It was month number : " + month);
        System.out.println("It has " + days + " days");

        if (days == 29) {
            System.out.println("Its a leap year!!");
        }

    }
}
