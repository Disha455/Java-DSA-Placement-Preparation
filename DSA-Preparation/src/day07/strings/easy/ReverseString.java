package day07.strings.easy;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Disha";
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));

        }
    }
}
