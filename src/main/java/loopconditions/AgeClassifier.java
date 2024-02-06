package loopconditions;

public class AgeClassifier {

    public static String classifyAge(int age) {
        if (age < 13) {
            return "Kid";
        } else if (age >= 13 && age <= 19) {
            return "Teen";
        } else {
            return "Adult";
        }
    }
}

