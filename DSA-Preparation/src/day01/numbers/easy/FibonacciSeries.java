package day01.numbers.easy;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 8;
        if(num == 0 ){
            System.out.println(0);
        }
        if(num == 1){
            System.out.println(1);
        }
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Series:");
        System.out.println(first + " ");
        System.out.println(second + " ");
        for(int i = 2; i< num;i++){
            int next = first + second;
            System.out.println(next + " ");
            first = second;
            second = next;
        }
    }
}
