package PROBLEMS;

import java.util.Scanner;

//WAP to calculate percentage of a student. his marks from 5 subject must be taken as input from user. (Marks out of 100);
public class First_Pr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float total, cgpa;

        System.out.println("Enter marks of C Language: ");
        float c = scan.nextFloat();
        System.out.println("Enter marks of Java Language: ");
        float java = scan.nextFloat();
        System.out.println("Enter marks of kotlin Language: ");
        float kotlin = scan.nextFloat();
        System.out.println("Enter marks of Python Language: ");
        float python = scan.nextFloat();
        System.out.println("Enter marks of Flutter Language: ");
        float flutter = scan.nextFloat();

        scan.close();

        total = (c + java + kotlin + python + flutter);
        cgpa = (total / 50);

        System.out.println("Percentage: " + cgpa);

    }

}
