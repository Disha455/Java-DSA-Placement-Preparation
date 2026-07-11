package day06.arrays.hard;

public class MaximumCircularSubarrayBruteForce {
    public static int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        // Try every starting point
        for (int i = 0; i < n; i++) {

            int currentSum = 0;

            // Extend the subarray up to n elements
            for (int j = 0; j < n; j++) {

                currentSum += nums[(i + j) % n];

                maxSum = Math.max(maxSum, currentSum);

            }

        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {5, -3, 5};

        System.out.println(maxSubarraySumCircular(nums));
    }
}
