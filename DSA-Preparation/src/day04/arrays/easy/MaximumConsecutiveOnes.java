package day04.arrays.easy;

public class MaximumConsecutiveOnes {

    // Method to find maximum consecutive 1's
    public static int findMaxConsecutiveOnes(int[] arr) {

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1};

        int result = findMaxConsecutiveOnes(arr);

        System.out.println("Maximum Consecutive Ones = " + result);
    }
}