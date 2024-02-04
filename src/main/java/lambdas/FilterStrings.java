package lambdas;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStrings {

    public static List<String> filterStringsStartingWithA(List<String> inputList) {
        Predicate<String> startsWithA = s -> s.startsWith("A") || s.startsWith("a");

        return inputList.stream()
                .filter(startsWithA.negate()) // Negate the predicate to filter out strings starting with "A"
                .collect(Collectors.toList());
    }
}

