package day05.arrays.medium;

import java.util.HashMap;

public class LongestZeroSumSubarray {

    public static int longestZeroSum(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Entire array from 0 to i has sum 0
            if (sum == 0) {
                maxLen = i + 1;
            }

            // Sum seen before
            if (map.containsKey(sum)) {

                int length = i - map.get(sum);

                maxLen = Math.max(maxLen, length);

            } else {

                // Store first occurrence only
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {9, -3, 3, -1, 6, -5};

        int ans = longestZeroSum(arr);

        System.out.println("Longest Zero Sum Subarray Length = " + ans);
    }
}