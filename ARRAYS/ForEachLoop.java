package ARRAYS;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] marks = { 1, 2, 3, 4 };

        for (int i = 0; i < 4; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("This is For each loop: ");

        // for each loop
        for (int value : marks) {
            System.out.println(value);
        }
    }

}
