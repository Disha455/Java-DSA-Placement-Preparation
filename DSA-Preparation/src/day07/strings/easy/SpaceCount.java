package day07.strings.easy;

public class SpaceCount {
    public static void main(String[] args) {
        String s = "My name is Disha";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){
                count++;
            }

        }
        System.out.print(count);
    }
}
