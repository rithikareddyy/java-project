package arrays;

public class Sorting {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to sort if the array has 0 or 1 element
        }

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
