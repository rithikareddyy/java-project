package loopconditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberReverserTest {

    @Test
    public void testReverseNumber_PositiveNumber() {
        int input = 12345;
        int expectedOutput = 54321;
        int actualOutput = NumberReverser.reverseNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }
}

