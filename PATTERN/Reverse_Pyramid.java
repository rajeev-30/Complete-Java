package PATTERN;

public class Reverse_Pyramid {
    public static void main(String[] args) {
        int n = 5;
        // rows
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print("   ");
            }

            // cols
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
