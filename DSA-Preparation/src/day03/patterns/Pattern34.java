package day03.patterns;

public class Pattern34 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            int start = (i<=5) ? 6-i:i-4;
            for(int j = 1;j<=5;j++){
                if(j>=start && (i+j)%2==0){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
