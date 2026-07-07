package day02.numbers.medium.hard;

import java.util.Scanner;

public class HappyNumber {
    public static int SumOfSquare(int n){
        int sum = 0;
        while(n>0){
            int dig = n % 10;
            sum = sum + (dig*dig);
            n = n/10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = SumOfSquare(slow);
            fast = SumOfSquare(SumOfSquare(fast));
        }while (slow!=fast);

        return slow == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isHappy(num)){
            System.out.println("Happy no.");
        }else{
            System.out.println("not happy no.");
        }
    }
}
