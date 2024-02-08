package strings;

public class Vowels {
    public static int countvow(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        String inp = "welcome class";
        System.out.println("Number of vowels = " + countvow(inp));
    }
}