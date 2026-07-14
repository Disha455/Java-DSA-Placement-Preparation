package day09.scenariobased.easy;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            // Update maximum sum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // Reset current sum if it becomes negative
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        // Directly initialized input
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}