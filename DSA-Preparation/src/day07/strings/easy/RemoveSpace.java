package day07.strings.easy;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "My name is Disha";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){
                continue;
            }
            System.out.print(ch);

        }
    }
}
