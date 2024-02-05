package lambdas;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class EvenNumberFilterTest {

    @Test
    public void testFilterAndDoubleOddNumbers() {
        List<Integer> inputList = Arrays.asList( 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = EvenNumberFilter.filterAndDoubleOddNumbers(inputList);

        List<Integer> expectedOutput = Arrays.asList(8, 12, 16, 20);


        Assert.assertEquals(expectedOutput, result);
    }

}