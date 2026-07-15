package day09.scenariobased.easy;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        // Directly initialized input
        int[] nums = {3, 0, 1};

        int result = missingNumber(nums);

        System.out.println("Missing Number = " + result);
    }
}