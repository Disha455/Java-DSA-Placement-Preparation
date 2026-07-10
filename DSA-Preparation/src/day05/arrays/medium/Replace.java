package day05.arrays.medium;

import java.util.Arrays;

public class Replace {
    public static int SumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            int dig = num %10;
            sum += dig;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {123,456, 789,345};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = SumOfDigits(arr[i]);

        }
        System.out.print(Arrays.toString(arr));
    }
}
