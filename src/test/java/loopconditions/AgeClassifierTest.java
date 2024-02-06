package loopconditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AgeClassifierTest {

    @Test
    public void testClassifyAge_Kid() {
        int age = 8;
        String expected = "Kid";
        String actual = AgeClassifier.classifyAge(age);
        assertEquals(expected, actual);
    }

    @Test
    public void testClassifyAge_Teen() {
        int age = 16;
        String expected = "Teen";
        String actual = AgeClassifier.classifyAge(age);
        assertEquals(expected, actual);
    }

    @Test
    public void testClassifyAge_Adult() {
        int age = 25;
        String expected = "Adult";
        String actual = AgeClassifier.classifyAge(age);
        assertEquals(expected, actual);
    }
}

