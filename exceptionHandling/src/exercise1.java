import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise1 {
    public static int getValidInteger(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        boolean option = true;
        int num = 0;
        while (option) {
            try {

                // System.out.print("Enter a number: ");
                num = input.nextInt();

                option = false;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!!. Please enter an integer");
                input.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!!. Please enter an integer");
                input.nextLine();
            }
        }

        return num;
    }

    public static int divideNumbers(int numerator, int denominator) {
        return (int) numerator / denominator;
    }

    public static void performDivision(ArrayList<String> history) {

        boolean again = true;
        int denominator;
        int numerator;

        while (again) {
            try {
                numerator = getValidInteger("Enter a numerator: ");
                denominator = getValidInteger("Enter a denominator: ");

                double result = divideNumbers(numerator, denominator);

                System.out.println("Result: " + result);

                history.add(numerator + " / " + denominator + " = " + result);

                again = false;

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by Zero. Please try again. ");

            } finally {
                System.out.println("Division operation completed ");
            }

        }

    }

    public static void divisionHistory(ArrayList<String> history) {
        System.out.println("==== Calculation History ====");

        for (String operation : history) {
            System.out.println(operation);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Safe Division Calculator === ");

        ArrayList<String> history = new ArrayList<>();
        String ans;
        do {
            performDivision(history);
            System.out.print("Do another calculation? (yes/no): ");
            ans = input.next();

            if (ans.equalsIgnoreCase("no")) {
                System.out.print("Show history? (yes/no): ");
                String ans2 = input.next();
                if (ans2.equalsIgnoreCase("yes")) {
                    divisionHistory(history);
                }
            }
        } while (ans.equalsIgnoreCase("yes"));

    }
}
