package strings;

public class ReverseEachWord {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }
        return String.join(" ", words);
    }

    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
    public static void main(String[] args) {
        String inp = "Java J2EE Reverse Me";
        System.out.println("Reverse: " + reverseWords(inp));
    }
}