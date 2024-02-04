package lambdas;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathOperatorTest {

    @Test
    public void testExecuteMathOperation_Addition() {
        MathOperation addition = (a, b) -> a + b;

        int result = MathOperator.executeMathOperation(5, 3, addition);

        assertEquals(8, result);
    }
}