package day04.arrays.easy;

public class SecondSmallestLargest {
    public static int secondSmallest(int[] arr,int n){
        if(n<2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < small){
                second_small = small;
                small= arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];

            }

        }
        return second_small;
    }
    public static int secondLargest(int[] arr, int n){
        if (n<2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>largest){
                second_large = largest;
                largest = arr[i];
            } else if (arr[i]> second_large && arr[i] != largest) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8};
        int n = arr.length;
        int sS = secondSmallest(arr,n);
        int sL = secondLargest(arr,n);
        System.out.println(" Second Smallest: " + sS);
        System.out.print("Second Largest: " + sL);
    }
}
