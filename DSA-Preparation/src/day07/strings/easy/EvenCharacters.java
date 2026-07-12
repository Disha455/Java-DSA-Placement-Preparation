package day07.strings.easy;

public class EvenCharacters {
    public static void main(String[] args) {
        String s = "Disha";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i%2==0){
                System.out.print(ch);
            }
        }
    }
}
