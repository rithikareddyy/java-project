package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class PositiveIntegerSquareSumTest {

    @Test
    public void testCalculateSumOfSquares() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        int expectedOutput = 1*1 + 2*2 + 3*3 + 4*4 + 5*5;

        int result = PositiveIntegerSquareSum.calculateSumOfSquares(inputList);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testCalculateSumOfSquares_EmptyList() {
        List<Integer> inputList = Arrays.asList();
        int expectedOutput = 0;

        int result = PositiveIntegerSquareSum.calculateSumOfSquares(inputList);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testCalculateSumOfSquares_NoPositiveIntegers() {
        List<Integer> inputList = Arrays.asList(-1, 0, -2, -3);
        int expectedOutput = 0; // Since there are no positive integers

        int result = PositiveIntegerSquareSum.calculateSumOfSquares(inputList);

        assertEquals(expectedOutput, result);
    }
}

