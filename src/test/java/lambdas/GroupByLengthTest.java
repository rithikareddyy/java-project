package lambdas;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GroupByLengthTest {
    @Test
    public void testGroupStringsByLength_EmptyList() {
        List<String> inputList = Arrays.asList();
        Map<Integer, List<String>> expectedOutput = new HashMap<>();

        Map<Integer, List<String>> result = GroupByLength.groupStringsByLength(inputList);

        assertEquals(expectedOutput, result);
    }

}
