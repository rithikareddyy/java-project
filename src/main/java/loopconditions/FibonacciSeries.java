package loopconditions;

public class FibonacciSeries {

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
