package lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {

    public static List<Integer> filterAndDoubleOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0  )
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}

