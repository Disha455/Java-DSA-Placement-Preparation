package day02.numbers.medium.hard;

import java.util.Scanner;

public class TwistedPrime {
    public static boolean isPrime(int n){
        if(n == 1) return false;
        for(int i = 2; i<= n/2;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static int reverse(int n){
        int reverse = 0;
        while(n>0){
            int dig = n%10;
            reverse = reverse*10 + dig;
            n = n/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num) && isPrime(reverse(num))){
            System.out.println("Twisted prime");
        }else{
            System.out.println("Not Twisted prime");
        }
    }
}
