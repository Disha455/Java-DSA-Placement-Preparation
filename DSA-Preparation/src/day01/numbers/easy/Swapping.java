package day01.numbers.easy;

public class Swapping {
    public static void main(String[] args) {
        int a = 22;
        int b = 77;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
