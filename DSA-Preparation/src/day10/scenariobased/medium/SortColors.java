package day10.scenariobased.medium;

public class SortColors {

    public static void sortColors(int[] nums) {

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        // Count the number of 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) {
                zeros++;
            } else if (num == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        // Fill the array in sorted order
        for (int i = 0; i < nums.length; i++) {
            if (zeros > 0) {
                nums[i] = 0;
                zeros--;
            } else if (ones > 0) {
                nums[i] = 1;
                ones--;
            } else {
                nums[i] = 2;
                twos--;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.print("Original Array: ");
        printArray(nums);

        sortColors(nums);

        System.out.print("Sorted Array: ");
        printArray(nums);
    }
}