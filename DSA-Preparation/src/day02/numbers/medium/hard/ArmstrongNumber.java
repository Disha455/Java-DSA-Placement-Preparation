package day02.numbers.medium.hard;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int LengthOfNum(int n){
       int count = 0;
       while(n>0){
           n/=10;
           count++;
       }
       return count;
    }
    public static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        int length = LengthOfNum(n);
        while(temp>0){
            int dig = temp%10;
            sum = sum + (int) Math.pow(dig,length);
            temp/=10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Armstrong no.");
        }else{
            System.out.println("not armstrong no.");
        }
    }
}
