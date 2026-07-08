package day03.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int num = i;
            for(int j = 1;j<=4;j++){
                System.out.print(num + " ");
                num = num + 5;
            }
            System.out.println();
        }
    }
}
