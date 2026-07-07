package day02.numbers.medium.hard;

import java.util.Scanner;

public class MysteryNumber {
    public static int reverse(int n){
        int rev =0;
        while(n>0){
            int dig = n % 10;
            rev = rev*10 + dig;
            n = n/10;
        }
        return rev;
    }
    public static boolean isMystery(int n){
        boolean mystery = false;
        for(int i = 1; i<=n;i++){
            if(i + reverse(i) == n){
                mystery = true;
                break;
            }
        }
        return mystery;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isMystery(num)){
            System.out.println("Mystery no");
        }else{
            System.out.println("not mystery");
        }
    }
}
