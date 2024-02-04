package lambdas;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void testSort() {
        String[] inputStrings = {"apple", "banana", "kiwi", "orange", "grape", "melon"};
        String[] expectedOutput = {"kiwi", "melon", "apple", "grape", "orange", "banana"};

        // Invoke the method being tested
        String[] result = ArraySort.sortStrings(inputStrings);

        // Check if the result is sorted based on the specified criteria
        assertArrayEquals(expectedOutput, result);
    }
}

