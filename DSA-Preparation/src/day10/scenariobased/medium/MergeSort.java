package day10.scenariobased.medium;

public class MergeSort {

    // Method to sort the array
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    // Recursive Merge Sort
    public static void mergeSort(int[] nums, int left, int right) {

        // Base case: if only one element, it's already sorted
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(nums, left, mid);

        // Sort right half
        mergeSort(nums, mid + 1, right);

        // Merge the two sorted halves
        merge(nums, left, mid, right);
    }

    // Merge two sorted halves
    public static void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;      // Left subarray pointer
        int j = mid + 1;   // Right subarray pointer
        int k = 0;         // Temporary array pointer

        // Compare elements from both halves
        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Copy remaining elements from right half
        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy sorted elements back to original array
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }

    // Method to print the array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {5, 2, 3, 1};

        System.out.print("Original Array: ");
        printArray(nums);

        sortArray(nums);

        System.out.print("Sorted Array: ");
        printArray(nums);
    }
}
