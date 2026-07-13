package day08.strings.medium;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Hello My Name Is Disha";
        String word = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                word = ch + word;
            } else {
                System.out.print(word + " ");
                word = "";
            }
        }

        // Print the last word
        System.out.print(word);
    }
}
