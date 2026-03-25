import java.util.Scanner;

public class exercise1 {

    public static int printPattern(int n) {
       

        for (int i = 1; i <= n; i++) {
            int sum = 0;

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                sum += j;
            }

            System.out.println("(sum = " + sum + ")");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int n = input.nextInt();

        printPattern(n);


    }
}
