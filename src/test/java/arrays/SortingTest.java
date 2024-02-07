package arrays;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortingTest {

    @Test
    public void testInsertionSort_NormalCase() {
        int[] arr = {5, 2, 9, 1, 7};
        int[] expected = {1, 2, 5, 7, 9};
        Sorting.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSort_EmptyArray() {
        int[] arr = {};
        int[] expected = {};
        Sorting.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSort_SingleElementArray() {
        int[] arr = {42};
        int[] expected = {42};
        Sorting.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }
}

