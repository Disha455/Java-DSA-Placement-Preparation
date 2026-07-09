package day04.arrays.easy;

public class OddMaximum {
    public static void main(String[] args) {
        int[] arr = {100,20,30,40,50};
        int max = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0){
                if(arr[i]> max){
                    max = arr[i];
                }
            }
        }
        System.out.print(max);
    }
}
