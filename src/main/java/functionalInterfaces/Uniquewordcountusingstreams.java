package functionalInterfaces;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Uniquewordcountusingstreams {

    public static int countUniqueWords(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = input.split("\\s+");

        Arrays.stream(words)
                .map(String::toLowerCase)
                .forEach(word -> wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1));

        return (int) wordCountMap.keySet().stream().count();
    }
}

