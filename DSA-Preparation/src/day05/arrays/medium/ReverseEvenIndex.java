package day05.arrays.medium;

import java.util.Arrays;

public class ReverseEvenIndex {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        for (int i = 0; i < arr.length/2; i++) {
            if(arr.length%2 == 0){
                if(i % 2 == 0){
                    int temp = arr[i];
                    arr[i] = arr[arr.length - 2-i];
                    arr[arr.length-2-i] = temp;
                }
            }else {
                if (i % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = temp;
                }
            }

        }
        System.out.print(Arrays.toString(arr));

    }
}
