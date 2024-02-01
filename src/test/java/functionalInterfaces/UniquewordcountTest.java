package functionalInterfaces;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;

public class UniquewordcountTest {
    @Test
    public void testCountUniqueWords() {
        String input = "Hello World Hello Java World";
        Map<String, Integer> result = Uniquewordcount.countUniqueWords(input);

        assertEquals(3, result.size());
        assertEquals(Integer.valueOf(2), result.get("Hello"));
        assertEquals(Integer.valueOf(2), result.get("World"));
        assertEquals(Integer.valueOf(1), result.get("Java"));
    }
}
