package day09.scenariobased.easy;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        // Convert to lowercase
        s = s.toLowerCase();

        // Remove all non-alphanumeric characters
        String str = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                continue;
            }

            str += ch;
        }

        // Reverse the cleaned string
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        // Compare original and reversed strings
        return str.equals(rev);
    }

    public static void main(String[] args) {

        // Directly initialized input
        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println("Is Palindrome? " + result);
    }
}
