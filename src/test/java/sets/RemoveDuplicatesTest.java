package sets;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        String input = "programming";
        String expectedOutput = "progamin";

        String result = RemoveDuplicates.removeDuplicates(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testRemoveDuplicatesEmptyString() {
        String input = "";
        String expectedOutput = "";

        String result = RemoveDuplicates.removeDuplicates(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testRemoveDuplicatesNoDuplicates() {
        String input = "abcdef";
        String expectedOutput = "abcdef";

        String result = RemoveDuplicates.removeDuplicates(input);

        assertEquals(expectedOutput, result);
    }
}
