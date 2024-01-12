package PROBLEMS;

public class Pr_4th {
    public static void main(String[] args) {
        char grade = 'A';

        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);

    }

}
