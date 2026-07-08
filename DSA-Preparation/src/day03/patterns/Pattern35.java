package day03.patterns;

public class Pattern35 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {

            int k = (i <= 5) ? i : 10 - i;

            // Left part
            for (int j = 1; j <= 5; j++) {
                System.out.print(j <= k ? "* " : "  ");
            }

            // Right part
            for (int j = 1; j <= 5; j++) {
                System.out.print(j > 5 - k ? "* " : "  ");
            }

            System.out.println();
        }
    }
}