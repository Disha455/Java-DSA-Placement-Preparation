package day02.numbers.medium.hard;

import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        boolean ascending = true;
        boolean descending = true;
        for(int i = 0;i< num.length()-1;i++){
            if(num.charAt(i)< num.charAt(i+1)){
                descending = false;
            } else if (num.charAt(i)> num.charAt(i+1)) {
                ascending=false;
            }

        }
        if(!ascending && !descending){
            System.out.println("Bouncy");
        }else{
            System.out.println("Not Bouncy");
        }
    }
}
