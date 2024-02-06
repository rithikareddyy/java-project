package loopconditions;
public class PatternPrinter {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print '+' characters
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("+");
            }
            // Print '-' characters
            for (int k = 1; k <= i; k++) {
                System.out.print("-");
            }
            // Move to the next line
            System.out.println("");
        }
    }
}


