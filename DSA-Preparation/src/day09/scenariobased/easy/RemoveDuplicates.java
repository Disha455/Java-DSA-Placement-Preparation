package day09.scenariobased.easy;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int[] temp = new int[nums.length];

        temp[0] = nums[0];
        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                temp[k] = nums[i];
                k++;
            }
        }

        // Copy unique elements back to nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }

    public static void main(String[] args) {

        // Directly initialized input
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);

        System.out.println("Number of Unique Elements = " + k);

        System.out.print("Array after removing duplicates = ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
