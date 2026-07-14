package day09.scenariobased.easy;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {

        // Square each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Sort the squared array
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        // Directly initialized input
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.println("Sorted Squares = " + Arrays.toString(result));
    }
}