package day07.strings.easy;

public class ConvertToLower {
    public static void main(String[] args) {
        String s = "DISHA";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
            }
            System.out.print(ch);
        }
    }
}
