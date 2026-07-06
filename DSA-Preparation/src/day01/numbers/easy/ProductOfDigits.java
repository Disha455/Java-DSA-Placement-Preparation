package day01.numbers.easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 18764593;
        int product = 1;
        while(num > 0){
            int digit = num % 10;
            product = product * digit;
            num  = num/10;
        }
        System.out.println("Product of digits: " + product);
    }
}

