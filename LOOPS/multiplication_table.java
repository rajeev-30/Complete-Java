package LOOPS;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(("Enter a number: "));
        int num = scan.nextInt();
        scan.close();

        int sum = 0;

        System.out.println("Multiplication table of: " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
            sum += (num * i);
        }
        System.out.printf("sum of multiplication table %d is: %d", num, sum);
    }

}
