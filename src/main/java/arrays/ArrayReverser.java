package arrays;

public class ArrayReverser {

    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr; // No need to reverse if the array has 0 or 1 element
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        return arr;
    }
}
