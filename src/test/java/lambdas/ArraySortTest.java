package lambdas;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {
    @Test
    public void testStringSorting() {
        String[] input = {"apple", "banana", "orange", "pear", "grape"};
        String[] expected = {"pear", "apple", "grape", "banana", "orange"};

        String[] result = ArraySort.sortStrings(input);

        Stream.of(result).forEach(System.out::println);
    }
}
