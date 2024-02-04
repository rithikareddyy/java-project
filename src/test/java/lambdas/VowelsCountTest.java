package lambdas;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class VowelsCountTest {

    @Test
    public void testPrintStringsWithVowels() {
        String[] inputStrings = {"apple", "banana", "kiwi", "grape", "123", ""};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        VowelsCount.printStringsWithVowels(inputStrings);

        String expectedOutput = "String: apple, Vowel Count: 2\n" +
                "String: banana, Vowel Count: 3\n" +
                "String: kiwi, Vowel Count: 2\n" +
                "String: grape, Vowel Count: 2\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}

