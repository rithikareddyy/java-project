package lambdas;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MathOperatorTest {

    @Test
    public void testAddition() {
        MathOperator addition = (a, b) -> a + b;
        int result = addition.operate(10, 5);
        assertEquals(15, result);
    }
}

