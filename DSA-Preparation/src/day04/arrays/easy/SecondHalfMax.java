package day04.arrays.easy;

public class SecondHalfMax {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,500,60};
        int max = arr[arr.length/2];
        for (int i = arr.length/2; i <arr.length ; i++) {
            if(arr[i]> max){
                max = arr[i];
            }

        }
        System.out.print(max);
    }
}
