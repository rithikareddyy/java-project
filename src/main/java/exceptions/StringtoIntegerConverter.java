package exceptions;

public class StringtoIntegerConverter {

    public static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + str);
        }
    }
}
