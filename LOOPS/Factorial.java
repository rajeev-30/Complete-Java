package LOOPS;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int fac = 1;
        sc.close();

        for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }
        System.out.printf(" \n%d ", fac);

    }

}
