package day01.numbers.easy;

public class PalindromeCheck {
    public static void main(String[] args) {
        int n = 1221;
        int temp = n;
        int reverse = 0;
        while(temp > 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp  = temp/10;
        }
        if(n == reverse){
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }
    }
}
