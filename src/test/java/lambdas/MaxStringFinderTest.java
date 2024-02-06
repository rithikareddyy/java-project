package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class MaxStringFinderTest {

    @Test
    public void testFindMaxString() {
        List<String> inputList = Arrays.asList("apple", "banana", "Orange", "Grapes", "kiwi");
        String expectedOutput = "Orange";

        String result = MaxStringFinder.findMaxString(inputList);

        assertEquals(expectedOutput, result);
    }
}

