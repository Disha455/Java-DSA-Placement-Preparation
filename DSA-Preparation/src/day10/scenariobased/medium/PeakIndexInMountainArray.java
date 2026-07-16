package day10.scenariobased.medium;

public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        for (int i = 0; i <= end; i++) {
            int mid = (start+end)/2;
            if(arr[mid]< arr[mid+1]){
                start = mid + 1;
            }else{
                end  = mid;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 7, 4, 3, 1};
        int peak = peakIndexInMountainArray(arr);
        System.out.print(peak);
    }
}
