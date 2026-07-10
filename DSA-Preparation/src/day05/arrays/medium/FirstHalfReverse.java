package day05.arrays.medium;

public class FirstHalfReverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        for (int i = arr.length/2; i >= 0 ; i--) {
            System.out.print(arr[i]+ " ");

        }
    }
}
