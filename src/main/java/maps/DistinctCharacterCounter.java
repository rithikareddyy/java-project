package maps;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterCounter {

    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Remove spaces and convert to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        // Loop through each character in the input string
        for (char ch : input.toCharArray()) {
            // Update the count in the map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
