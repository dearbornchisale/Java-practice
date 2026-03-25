import java.util.Scanner;

public class exercise3 {

    public static void analyzeNumbers(int[] numbers) {
        int index = 0;
        int count = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;

        int max = numbers[0];
        int min = numbers[0];

        while (index < numbers.length) {

            count++;

            if (numbers[index] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (numbers[index] > max) {
                max = numbers[index];
            } else if (numbers[index] < min) {
                min = numbers[index];
            }

            sum += numbers[index];
            index++;
        }
        double average = (double) sum / count;

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Even count : " + even);
        System.out.println("Odd count : " + odd);
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = { 1, 2, 3, 4, 5, 6, 9 };

        analyzeNumbers(numbers);

    }
}
