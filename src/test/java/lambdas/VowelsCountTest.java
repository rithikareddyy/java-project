package lambdas;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsCountTest {

    @Test
    public void testCountVowels() {
        assertEquals(2, VowelsCount.countVowels("hello"));
        assertEquals(1, VowelsCount.countVowels("world"));
    }
}