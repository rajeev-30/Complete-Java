package PRACTICE;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int n = sc.nextInt();
        System.out.println("How many digits in your number: ");
        int d = sc.nextInt();

        int temp = 0;
        for (int i = d; i > 0; i--) {
            temp = n % 10;
            n = n / 10;
            System.out.println("place " + i + ": " + temp);
        }
    }

}
