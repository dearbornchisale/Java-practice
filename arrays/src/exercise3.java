import java.util.Arrays;

public class exercise3 {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (k < arr3.length) {
            if (i >= arr1.length) {
                arr3[k] = arr2[j];
                j++;
            } else if (j >= arr2.length) {
                arr3[k] = arr1[i];
                i++;
            } else if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }

            k++;
        }

        return arr3;

    }

    public static int[] removeDuplicates(int[] duplicateArray){
        int idx = 1; 

        for(int i = 1; i < duplicateArray.length; i++){
            if(duplicateArray[i] != duplicateArray[i -1 ]){
                duplicateArray[idx++] = duplicateArray[i];
            }
        }

        return duplicateArray;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };
        int[] duplicateArray = {1,2,3,4,5,5,6,7,8};

        int[] result =  mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(result));

        int[] duplicateResult = removeDuplicates(duplicateArray);

        System.out.print("" + duplicateResult);


    }
}
