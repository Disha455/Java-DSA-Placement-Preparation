package day07.strings.easy;

public class EvenUpperOddLower {
    public static void main(String[] args) {
        String s = "Disha";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i%2 == 0){
                if (ch>= 'a' && ch<= 'z'){
                    ch = (char)(ch -32);
                }
            }else{
                if (ch>='A' && ch<='Z'){
                    ch = (char) (ch+32);
                }
            }
            System.out.print(ch);
        }
    }
}
