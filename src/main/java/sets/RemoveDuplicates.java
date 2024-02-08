package sets;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[256]; // Assuming ASCII characters

        for (char ch : input.toCharArray()) {
            if (!visited[ch]) {
                result.append(ch);
                visited[ch] = true;
            }
        }

        return result.toString();
    }
}
