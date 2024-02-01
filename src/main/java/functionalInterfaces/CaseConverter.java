package functionalInterfaces;

// CharacterSwapper.java
public class CaseConverter {
    public static String swapCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if (Character.isLowerCase(currentChar)) {
                charArray[i] = Character.toUpperCase(currentChar);
            } else if (Character.isUpperCase(currentChar)) {
                charArray[i] = Character.toLowerCase(currentChar);
            }
            // Ignore characters that are not letters
        }

        return new String(charArray);
    }
}
