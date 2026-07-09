package day04.arrays.easy;

public class IndexOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int num = 30;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== num){
                System.out.print(i);
                break;
            }
        }
    }
}
