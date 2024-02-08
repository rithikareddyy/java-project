package maps;

import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

public class SumTest {

    @Test
    public void testFindTwoSumIndices() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] expected = {3, 5};

        int[] result = Sum.findTwoSumIndices(nums, target);

        assertArrayEquals(expected, result);
    }
}

