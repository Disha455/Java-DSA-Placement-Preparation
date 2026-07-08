package day03.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1;i<=4;i++){
            for(int j = 1;j<=5;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
