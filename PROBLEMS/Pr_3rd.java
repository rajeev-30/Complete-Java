package PROBLEMS;

import java.util.Scanner;

//WAP to check wether the entered number is integer or not;
public class Pr_3rd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        scan.close();

        System.out.println(scan.hasNextInt());
    }

}
