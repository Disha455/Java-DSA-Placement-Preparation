package day01.numbers.easy;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num = 18764593;
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num  = num/10;
        }
        System.out.println("Reverse of the number: " + reverse);
    }
}