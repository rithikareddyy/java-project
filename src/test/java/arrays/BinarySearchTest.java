package arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch_Exists() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int expectedIndex = 3;
        int actualIndex = BinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearch_NotExists() {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 5; // Target does not exist in the array
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        int[] arr = {};
        int target = 5; // Target does not exist in an empty array
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }
}

