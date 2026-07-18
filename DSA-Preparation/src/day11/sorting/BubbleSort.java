package day11.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {55, 67,23,45,90};
        int length = arr.length;
        int temp;
        for(int i = 1; i< length;i++){
            boolean swap = false;
            for(int j=0; j<length -i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap =true;
                }
            }
            if(swap == false){
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
