package lambdas;

import java.util.Arrays;

public class VowelsCount {

    public static void printStringsWithVowels(String[] strings) {
        Arrays.stream(strings)
                .filter(VowelsCount::containsVowels)
                .forEach(s -> System.out.println("String: " + s + ", Vowel Count: " + countVowels(s)));
    }

    private static boolean containsVowels(String str) {
        return str.chars().anyMatch(c -> "aeiouAEIOU".indexOf(c) != -1);
    }

    private static long countVowels(String str) {
        return str.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
    }
}

