package day06.arrays.hard;

public class MaximumCircularSubarray {

        public static int maxSubarraySumCircular(int[] nums) {

            int totalSum = 0;

            int currentMax = 0;
            int maxSum = nums[0];

            int currentMin = 0;
            int minSum = nums[0];

            for (int num : nums) {

                // Kadane for maximum sum
                currentMax = Math.max(num, currentMax + num);
                maxSum = Math.max(maxSum, currentMax);

                // Kadane for minimum sum
                currentMin = Math.min(num, currentMin + num);
                minSum = Math.min(minSum, currentMin);

                totalSum += num;
            }

            // All elements are negative
            if (maxSum < 0)
                return maxSum;

            return Math.max(maxSum, totalSum - minSum);
        }

        public static void main(String[] args) {

            int[] nums = {5, -3, 5};

            System.out.println(maxSubarraySumCircular(nums));
        }
    }

