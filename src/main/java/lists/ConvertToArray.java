package lists;

import java.util.ArrayList;

public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");

        String[] stringArray = convertArrayListToArray(stringList);

        System.out.println("Array elements:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }

    public static String[] convertArrayListToArray(ArrayList<String> list) {
        String[] array = new String[list.size()];
        list.toArray(array);

        return array;
    }
}
