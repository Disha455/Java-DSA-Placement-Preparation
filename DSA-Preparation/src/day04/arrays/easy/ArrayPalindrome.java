package day04.arrays.easy;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {10,20,30,20,10};
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= arr[arr.length-1-i]){
                isPalindrome= false;
                break;
            }

        }
        System.out.print(isPalindrome);
    }
}
