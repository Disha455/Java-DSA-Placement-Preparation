package day03.patterns;

public class Pattern33 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            int cols = (i<=5) ? i:10-i;
            for(int j = 1;j<=cols;j++){
                if((i+j)%2==0){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
