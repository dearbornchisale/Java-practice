import java.util.Scanner;

public class exercise2 {
    public static void guessTheNumberGame(int maxNUmber, int numberAttempts) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;
        int min = 1;

        int random = min + (int) (Math.random() * ((maxNUmber - min) + 1));
        while (playAgain) {
            do {
                System.out.print("Guess the number generated: ");
                int guess = input.nextInt();

                if (guess == random) {
                    System.out.println("Correct! You guessed it in " + numberAttempts + " attempts");
                } else if (guess != random) {
                    numberAttempts -= 1;

                    System.out.println("Incorrect! You have " + numberAttempts + " attempts left");

                }
            } while (numberAttempts >= 0);

            System.out.println("Sorry! The number was " + random);
            System.out.print("Do you want to play again? (YES/NO): ");
            String ans = input.next().toUpperCase();

            if (!ans.equals("YES")) {
                playAgain = false;
            }

        }

    }

    public static void main(String[] args) {

        guessTheNumberGame(50, 3);
    }
}
