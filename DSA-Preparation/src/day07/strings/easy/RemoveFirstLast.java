package day07.strings.easy;

public class RemoveFirstLast {
    public static void main(String[] args) {
        String s = "Disha";
        for (int i = 1; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            System.out.print(ch);

        }
    }
}
