package strings;

public class Rotation {
    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }

        String concatenatedStr = str1 + str1;

        return concatenatedStr.contains(str2);
    }
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        if (areRotations(str1, str2)) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
    }
}
