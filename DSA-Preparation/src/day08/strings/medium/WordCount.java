package day08.strings.medium;

public class WordCount {
    public static void main(String[] args) {
        String s = "My name is Disha";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.print(count);

    }
}
