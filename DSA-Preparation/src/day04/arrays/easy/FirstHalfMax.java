package day04.arrays.easy;

public class FirstHalfMax {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int max = arr[0];
        for (int i = 0; i < arr.length/2; i++) {
                if(arr[i]> max){
                    max = arr[i];
                }

        }
        System.out.print(max);
    }
}
