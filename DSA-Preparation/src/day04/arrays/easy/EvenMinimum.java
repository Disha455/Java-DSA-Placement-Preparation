package day04.arrays.easy;

public class EvenMinimum {
    public static void main(String[] args) {
        int[] arr = {100,20,30,40,50};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                if(arr[i]< min){
                    min = arr[i];
                }
            }
        }
        System.out.print(min);
    }
}
