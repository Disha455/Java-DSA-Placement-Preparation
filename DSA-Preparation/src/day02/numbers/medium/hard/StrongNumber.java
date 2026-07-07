package day02.numbers.medium.hard;

public class StrongNumber {
    public static int fact(int n){
        int  prod = 1;
        for(int i = n; i>=1; i--){
            prod = prod * i;
        }
        return prod;
    }
    public static boolean isStrong(int n){
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum = sum + fact(digit);
            temp = temp/10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        System.out.println(isStrong(145));
    }
}
