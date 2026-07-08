package day03.patterns;

public class Pattern5 {
    public static void main(String[] args) {
            for(int i=1;i<=4;i++){
                for(int j = 1;j<=5;j++){
                    if(j % 2 == 0)
                        System.out.print("0 ");
                    else
                        System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

