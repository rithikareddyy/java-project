package functionalInterfaces;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaseConverterTest {
    @Test
    public void testSwapCase() {
        String input = "Rithika";
        assertEquals("rITHIKA", CaseConverter.swapCase(input));
    }

    @Test
    public void testSwapCase1() {
        String input = "JavaProgramming";
        assertEquals("jAVApROGRAMMING", CaseConverter.swapCase(input));
    }
}

