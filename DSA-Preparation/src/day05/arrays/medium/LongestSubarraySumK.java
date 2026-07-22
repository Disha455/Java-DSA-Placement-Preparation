package day05.arrays.medium;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] nums, int k) {

        int left = 0;
        int right = 0;

        int sum = 0;
        int maxLen = 0;

        while (right < nums.length) {

            sum += nums[right];

            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int ans = longestSubarray(nums, k);

        System.out.println("Longest Length = " + ans);
    }
}