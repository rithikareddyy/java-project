package lambdas;

import java.util.Arrays;

public class Oddnumberaverage {

    public static double Averagecalculater(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average()
                .orElse(0);
    }
}

