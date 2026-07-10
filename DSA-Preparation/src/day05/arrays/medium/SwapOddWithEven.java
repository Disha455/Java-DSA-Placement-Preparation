package day05.arrays.medium;

import java.util.Arrays;

public class SwapOddWithEven {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        System.out.print(Arrays.toString(arr));
    }
}
