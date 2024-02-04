package lambdas;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CapitalizeSortTest {

    @Test
    public void testProcessAndSortStrings_WithMixedCase() {
        String[] inputStrings = {"apple", "Banana", "cherry", "Date"};
        String[] result = CapitalizeSort.processAndSortStrings(inputStrings);

        // Check if the result is correctly processed and sorted
        assertArrayEquals(new String[]{"Apple", "Banana", "Cherry", "Date"}, result);
    }

}
