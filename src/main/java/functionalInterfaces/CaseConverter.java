package functionalInterfaces;

public class CaseConverter {
    public static void main(String[] args) {
        String str = "Hello World!";
        String convertedStr = convertCase(str);
        System.out.println("Original String: " + str);
        System.out.println("Converted String: " + convertedStr);
    }

    public static String convertCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

