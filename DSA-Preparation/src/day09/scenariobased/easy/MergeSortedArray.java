package day09.scenariobased.easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = 0;

        // Copy nums2 into nums1
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        // Sort the merged array
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        // Directly initialized input
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.println(Arrays.toString(nums1));
    }
}
