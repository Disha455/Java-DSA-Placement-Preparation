package day07.strings.easy;

public class LastWordLength {
    public static void main(String[] args) {
        String s = "  this is disha  ";
        int end = s.length()-1;
        while (s.charAt(end) == ' '){
            end--;
        }
        int count = 0;
        for (int i = end; i >=0 ; i--) {
            char ch = s.charAt(i);
            if(ch == ' '){
                break;
            }
            count++;
        }
        System.out.print(count);
    }
}
