package day07.strings.easy;

public class LengthOfString {
    public static void main(String[] args) {
        String s = "Disha";
        int count = 0;
        for (char c : s.toCharArray()){
            count++;
        }
        System.out.print(count);
    }
}
