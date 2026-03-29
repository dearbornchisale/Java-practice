import java.util.Random;

public class exercise1 {
    public static int[] generateRandomArray(int size, int min, int max) {

        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            int randomNum = random.nextInt(max - min + 1) + min;

            numbers[i] = randomNum;
        }

        return numbers;

    }

    public static void displayArray(int[] numbers, String label) {
        System.out.print(label + ": ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }

        System.out.println();
    }

    public static int[] reverseArray(int[] numbers) {
        int[] reverseNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reverseNumbers[i] = numbers[numbers.length - 1 - i];
        }

        return reverseNumbers;
    }

    public static boolean isPalindrome(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray(7, 10, 99);
        displayArray(arr, "Original Array");
        int[] reversed = reverseArray(arr);
        displayArray(reversed, "Reverse Array");
        boolean result = isPalindrome(arr);

        System.out.println("Is palindrome? " + result);
        

    }
}
