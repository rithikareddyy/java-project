package maps;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DistinctCharacterCounterTest {

    @Test
    public void testCountCharacters() {
        String input = "test string";
        Map<Character, Integer> charCountMap = DistinctCharacterCounter.countCharacters(input);

        // Test the count of each character
        assertEquals(3, charCountMap.get('t').intValue());
        assertEquals(1, charCountMap.get('e').intValue());
        assertEquals(2, charCountMap.get('s').intValue());
        assertEquals(1, charCountMap.get('r').intValue());
        assertEquals(1, charCountMap.get('i').intValue());
        assertEquals(1, charCountMap.get('n').intValue());
        assertEquals(1, charCountMap.get('g').intValue());
    }
}


