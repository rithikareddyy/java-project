package functionalInterfaces;

public class ArraySum {
    public static int Sum(int[] a)
    {

        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;


    }
}
