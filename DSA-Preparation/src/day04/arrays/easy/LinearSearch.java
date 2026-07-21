package day04.arrays.easy;

public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;   // Return index if found
            }
        }

        return -1;  // Target not found
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {10, 25, 8, 40, 15, 30};
        int target = 15;

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
