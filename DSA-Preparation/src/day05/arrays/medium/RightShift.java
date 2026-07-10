package day05.arrays.medium;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int last = arr[arr.length-1];
        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        System.out.print(Arrays.toString(arr));
    }
}
