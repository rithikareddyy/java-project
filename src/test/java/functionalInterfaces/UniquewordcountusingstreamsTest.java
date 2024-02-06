package functionalInterfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class UniquewordcountusingstreamsTest {

    @Test
    public void testCountUniqueWords_SingleWord() {
        String input = "hello";
        int result = Uniquewordcountusingstreams.countUniqueWords(input);
        assertEquals(1, result);
    }

    @Test
    public void testCountUniqueWords_MultipleWords() {
        String input = "hello world hello";
        int result = Uniquewordcountusingstreams.countUniqueWords(input);
        assertEquals(2, result);
    }


}

