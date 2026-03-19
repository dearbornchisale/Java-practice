import java.util.Scanner;

public class exercise3 {
    public static int[] findPrimesInRange(int start, int end) {
        if (start > end)
            return new int[0];

        int[] arr1 = new int[end - start + 1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = start + i;
        }

        int arr = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr;
            boolean isPrime = isPrime(arr);
            if (isPrime == true) {
                int [] primeArry = new int [i];
            }

        }

        return arr1;

    }

    public static boolean isPrime(int arr) {
        if (arr % 2 != 0) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start point: ");
        int start = input.nextInt();

        System.out.print("Enter the end point: ");
        int end = input.nextInt();

        int[] result = findPrimesInRange(start, end);

        for (int num : result) {
            System.out.print(result + " ");
        }

    }
}
