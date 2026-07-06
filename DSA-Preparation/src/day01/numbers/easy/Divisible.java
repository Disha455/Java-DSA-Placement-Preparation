package day01.numbers.easy;

public class Divisible {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int num = 55;
        if(num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by both 5 and 11");
        } else {
            System.out.println("Not divisible by both 5 and 11");
        }
    }
}
