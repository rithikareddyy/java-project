package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class EvenNumberFilterTest {

    @Test
    public void testFilterAndDoubleOddNumbers() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedOutput = Arrays.asList(2, 6, 10, 14, 18);

        List<Integer> result = EvenNumberFilter.filterAndDoubleOddNumbers(inputList);

        assertEquals(expectedOutput, result);
    }

}