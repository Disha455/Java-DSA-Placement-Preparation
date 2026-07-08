package day03.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int num =1;
        for(int i=1;i<=4;i++){
            for(int j = 1;j<=5;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
