package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class FilterStringsTest {

    @Test
    public void testFilterStringsStartingWithA() {
        List<String> inputList = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");
        List<String> expectedOutput = Arrays.asList("Banana", "Orange","Grapes");

        List<String> result = FilterStrings.filterStringsStartingWithA(inputList);

        assertEquals(expectedOutput, result);
    }
}

