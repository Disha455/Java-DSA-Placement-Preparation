package day09.scenariobased.easy;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare the sorted arrays
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        // Directly initialized input
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println("Are the strings anagrams? " + result);
    }
}