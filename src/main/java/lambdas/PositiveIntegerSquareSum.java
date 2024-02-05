package lambdas;

import java.util.List;

public class PositiveIntegerSquareSum {

    public static int calculateSumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .mapToInt(n -> n * n)      // Square each positive integer
                .sum();
    }
}

