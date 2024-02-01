package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uniquewordcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int uniqueWordCount = countUniqueWords(inputString);
        System.out.println("Number of unique words: " + uniqueWordCount);

        scanner.close();
    }

    public static int countUniqueWords(String str) {
        // Remove leading and trailing spaces, and split the string into words
        String[] words = str.trim().split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();
//updating count of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Count the number of unique words
        int uniqueWordCount = 0;
        for (int count : wordCountMap.values()) {
            if (count == 1) {
                uniqueWordCount++;
            }
        }

        return uniqueWordCount;
    }
}

