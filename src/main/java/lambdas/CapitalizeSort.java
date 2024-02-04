package lambdas;
import java.util.Arrays;
import java.util.Comparator;

public class CapitalizeSort {

    public static String[] processAndSortStrings(String[] inputStrings) {
        return Arrays.stream(inputStrings)
                .map(CapitalizeSort::capitalizeFirstLetter)
                .sorted(Comparator.naturalOrder())
                .toArray(String[]::new);
    }

    private static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }
}
