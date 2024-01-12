package PROBLEMS;

import java.util.Scanner;

//WAP to check wether student is passed or fail;
//Note :--> Total percentage is 40%, and each subject 33 marks is required;
public class Pr_6th {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float total, percentage;

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

        total = (c + java + kotlin + python + flutter);
        percentage = (total / 5);

        System.out.println("Percentage: " + percentage);

        if (percentage >= 40.0 && c >= 33 && java >= 33 && kotlin >= 33 && python >= 33 && flutter >= 33) {
            System.out.println("You are passed");
        } else
            System.out.println("You are fail!");
    }

}
