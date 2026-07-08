package day03.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        for(int i=20;i>=17;i--){
            int num = i;
            for(int j = 1;j<=3;j++){
                System.out.print(num + " ");
                num = num -4;
            }
            System.out.println();
        }
    }
}
