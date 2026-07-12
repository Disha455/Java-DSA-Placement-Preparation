package day07.strings.easy;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Chaitanya";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A'|| ch == 'a'||ch == 'I'|| ch == 'i'||ch == 'O'|| ch == 'o'||ch == 'E'|| ch == 'e'||ch == 'U'|| ch == 'u'){
                continue;
            }
            System.out.print(ch);

        }
    }
}
