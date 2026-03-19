import java.util.Scanner;

public class exercise2 {
    public static int[] combineArrays(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        return arr3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 5, 6, 7, 8, 9 };

        int[] combined = combineArrays(arr1, arr2);

        for (int num : combined) {
            System.out.print(num + " ");
        }

    }
}
