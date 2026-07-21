package day05.arrays.medium;

public class LeftRotateByk {

    public static void rotateLeft(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.print("Original Array: ");
        printArray(nums);

        rotateLeft(nums, k);

        System.out.print("After Left Rotation: ");
        printArray(nums);
    }
}