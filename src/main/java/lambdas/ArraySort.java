package lambdas;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

    public static String[] sortStrings(String[] strings) {
        return Arrays.stream(strings)
                .sorted(Comparator.comparing((String s) -> s.length())  // Sort by length in ascending order
                        .thenComparing(Comparator.comparing((String s) -> s.length()).reversed())
                        .thenComparing(Comparator.comparing((String s) -> s.charAt(s.length() - 1)).reversed()))
                .toArray(String[]::new);
    }
}
