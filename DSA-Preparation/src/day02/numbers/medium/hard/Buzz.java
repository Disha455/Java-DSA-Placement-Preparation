package day02.numbers.medium.hard;

public class Buzz {
    public static void main(String[] args) {
        int num = 75;
        if(num % 7 == 0 || num % 10 ==7){
            System.out.println("Buzz no.");
        }else{
            System.out.println("Not Buzz no.");
        }
    }
}
