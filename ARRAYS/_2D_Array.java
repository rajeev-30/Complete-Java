package ARRAYS;

public class _2D_Array {

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int i = 0; i < 2; i++) { // this is for row (row = 2);
            for (int j = 0; j < 3; j++) { // this is for col (col = 3);
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }

            System.out.println("");
        }

    }

}
