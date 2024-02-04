package lambdas;

import java.util.Arrays;

public class Oddnumberaverage {

    public static double Averagecalculater(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)  // Filter odd numbers
                .mapToDouble(n -> Math.pow(n, 2))  // Square each odd number
                .average()  // Calculate average
                .orElse(0);  // Default to 0 if no odd numbers
    }
}

