package lambdas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddnumberaverageTest {

    @Test
    public void calculateaverage() {
        int[] numbers = {1, 3, 5, 7, 9};
        double result = Oddnumberaverage.Averagecalculater(numbers);

        // Check if the result is the average of squares of odd numbers
        assertEquals(33.0, result, 0.001);
    }

}

