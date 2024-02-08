package lists;

import java.util.ArrayList;

public class ArrayListTraversal {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");
        stringList.add("Mango");

        // Traverse using a for loop
        System.out.println("Traversing using a for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Element at index " + i + ": " + stringList.get(i));
        }

        // Traverse using an enhanced for loop (for-each loop)
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String fruit : stringList) {
            System.out.println("Element: " + fruit);
        }
    }
}
