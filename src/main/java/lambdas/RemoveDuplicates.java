package lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicateIntegers(List<Integer> numbers) {
        return numbers.stream()
                .distinct()               // Remove duplicates
                .collect(Collectors.toList());
    }
}
