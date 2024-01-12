package PROBLEMS;

public class Pr_08 {
    public static void main(String[] args) {
        int row = 4;
        for (int i = row; i > 0; i--) {

            System.out.print("\n");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

}
