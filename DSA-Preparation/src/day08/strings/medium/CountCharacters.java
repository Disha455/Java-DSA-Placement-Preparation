package day08.strings.medium;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "my age is 21!";

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check for alphabets
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

                // Convert uppercase to lowercase
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char)(ch + 32);
                }

                // Check vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }

            // Check digits
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }

            // Ignore spaces
            else if (ch == ' ') {
                continue;
            }

            // Remaining are special characters
            else {
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }
}