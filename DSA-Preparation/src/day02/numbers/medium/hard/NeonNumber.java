package day02.numbers.medium.hard;

public class NeonNumber {
    public static boolean isNeon(int n){
        int square = n*n;
        int sum = 0;
        while(square > 0){
            int dig = square % 10;
            sum = sum + dig;
            square = square/10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isNeon(9));
    }
}
