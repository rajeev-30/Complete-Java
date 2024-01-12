package PROBLEMS;

import java.util.Scanner;

//WAP to convert meter to kilometer;
public class Pr_2nd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter meters: ");
        int m = scan.nextInt();
        int km = 0;
        scan.close();

        while (m >= 1000) {
            km++;
            m -= 1000;
        }
        System.out.println(km + " Kilometer " + m + " meter");
    }

}
