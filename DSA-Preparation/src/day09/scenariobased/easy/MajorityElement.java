package day09.scenariobased.easy;

import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }

    public static void main(String[] args) {

        // Directly initialized input
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);

        System.out.println("Majority Element = " + result);
    }
}