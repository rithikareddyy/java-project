package arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayMinMaxFinderTest {

    @Test
    public void testFindMinMax_ValidInput() {
        int[] numbers = {5, 2, 9, 1, 7, 3, 8};
        ArrayMinMaxFinder.findMinMax(numbers);
    }

    @Test
    public void testFindMinMax_EmptyArray() {
        int[] numbers = {};
        ArrayMinMaxFinder.findMinMax(numbers);
        // You can add assertions for the output if needed
    }

    @Test
    public void testFindMinMax_NullArray() {
        int[] numbers = null;
        ArrayMinMaxFinder.findMinMax(numbers);
        // You can add assertions for the output if needed
    }
}

