package functionalInterfaces;

// StringRotationChecker.java
public class Rotation {

    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenatedStr = str1 + str1;
        return concatenatedStr.contains(str2);
    }
}

