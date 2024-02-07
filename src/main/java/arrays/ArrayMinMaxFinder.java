package arrays;
public class ArrayMinMaxFinder {

    public static void findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty or null. Cannot find min and max.");
            return;
        }

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static void main(String[] args) {
        // Example usage
        int[] numbers = {5, 2, 9, 1, 7, 3, 8};
        findMinMax(numbers);
    }
}
