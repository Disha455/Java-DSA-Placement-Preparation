package day03.patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int num = 1;
        char ch = 'A';
        boolean res = true;
        for(int i=1;i<=3;i++){
            for(int j = 1;j<=4;j++){
                if(res){
                    System.out.print(num + " ");
                    res = false;
                    num++;
                }else{
                    System.out.print(ch + " ");
                    res = true;
                    ch++;
                }

            }
            System.out.println();
        }
    }
}
