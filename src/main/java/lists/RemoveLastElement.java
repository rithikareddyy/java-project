package lists;

import java.util.ArrayList;

public class RemoveLastElement {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");
        stringList.add("Mango");

        System.out.println("Original ArrayList: " + stringList);

        // Remove the last element
        removeLastElement(stringList);

        // Display the ArrayList after removal
        System.out.println("ArrayList after removing the last element: " + stringList);
    }

    public static void removeLastElement(ArrayList<String> list) {
        // Check if the list is not empty
        if (!list.isEmpty()) {
            // Remove the last element using the remove method with the index
            list.remove(list.size() - 1);
        }
    }
}
