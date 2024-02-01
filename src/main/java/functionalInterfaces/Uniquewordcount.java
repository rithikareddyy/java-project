package functionalInterfaces;
import java.util.HashMap;
import java.util.Map;

public class Uniquewordcount {
    public static Map<String, Integer> countUniqueWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = input.split("\\s+");

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
