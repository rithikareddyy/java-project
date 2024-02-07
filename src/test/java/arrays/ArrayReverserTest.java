package arrays;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayReverserTest {

    @Test
    public void testReverseArray_OddLength() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, ArrayReverser.reverseArray(array));
    }

    @Test
    public void testReverseArray_EvenLength() {
        int[] array = {10, 20, 30, 40};
        int[] expected = {40, 30, 20, 10};
        assertArrayEquals(expected, ArrayReverser.reverseArray(array));
    }

    @Test
    public void testReverseArray_SingleElement() {
        int[] array = {7};
        int[] expected = {7};
        assertArrayEquals(expected, ArrayReverser.reverseArray(array));
    }

    @Test
    public void testReverseArray_NullArray() {
        int[] array = null;
        int[] expected = null;
        assertArrayEquals(expected, ArrayReverser.reverseArray(array));
    }
}

