package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicateIntegers() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 4, 5, 6); // After removing duplicates

        List<Integer> result = RemoveDuplicates.removeDuplicateIntegers(inputList);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testRemoveDuplicateIntegers_AllDuplicates() {
        List<Integer> inputList = Arrays.asList(5, 5, 5, 5, 5);
        List<Integer> expectedOutput = Arrays.asList(5); // After removing duplicates

        List<Integer> result = RemoveDuplicates.removeDuplicateIntegers(inputList);

        assertEquals(expectedOutput, result);
    }
}

