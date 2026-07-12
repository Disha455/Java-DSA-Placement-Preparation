package day07.strings.easy;

public class RemoveSpaceFirstLast {
    public static void main(String[] args) {
        String s = "  Disha  ";
        int start = 0;
        int end = s.length()-1;
        while (s.charAt(start) == ' '){
            start++;
        }
        while (s.charAt(end) == ' '){
            end--;
        }
        for (int i = start; i <= end; i++) {
            System.out.print(s.charAt(i));

        }
    }
}
