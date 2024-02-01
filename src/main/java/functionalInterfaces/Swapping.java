package functionalInterfaces;

public class Swapping {

public static void Swap(int x, int y) {
    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("After swapping: x = " + x + ", y = " + y );

   }
}
