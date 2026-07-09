package day04.arrays.easy;

import java.util.Arrays;

public class ReverseBySwap {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        for (int i = 0; i < arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;
        }
        System.out.print(Arrays.toString(arr));
    }

}
