package day02.numbers.medium.hard;

import java.util.Scanner;

public class DuckNumber {
    public static boolean isDuck(int n){
        boolean duck = false;
        while(n>0){
            int dig = n % 10;
            if(dig == 0){
                duck = true;
                break;
            }
            n = n/10;
        }
        return duck;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isDuck(n));
    }
}
