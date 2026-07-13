package day08.strings.medium;

public class FirstLetterUpper {
    public static void main(String[] args) {
        String str = "my name is disha";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Convert first character of the string
            if (i == 0 && ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            // Convert first character after a space
            else if (i > 0 && str.charAt(i - 1) == ' ' && ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            System.out.print(ch);
        }
    }
}