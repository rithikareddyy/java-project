package arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 if array is empty or null
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller, ignore right half
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }
}
