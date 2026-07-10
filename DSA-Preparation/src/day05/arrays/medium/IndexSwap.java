package day05.arrays.medium;

import java.util.Arrays;

public class IndexSwap {
    public static void main(String[] args) {
        int i1= 0;
        int i2 = 3;
        int[] arr = {10,20,30,40,50};

        int temp = arr[i1];
        arr[i1]= arr[i2];
        arr[i2]= temp;
        System.out.print(Arrays.toString(arr));

    }
}
