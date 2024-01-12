package PROJECTS;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.println(("Enter 1st number"));
        num1 = scan.nextFloat();

        System.out.println(("Enter 2nd number"));
        num2 = scan.nextFloat();
        System.out.println("You have entered: " + num1 + " and " + num2);

        String prompt = "Enter 0 for addition, 1 for subtraction, 2 for multiplication, 3 for division";
        System.out.println(prompt);

        int input = scan.nextInt();

        // scan.close();

        switch (input) {
            case 0:
                System.out.println("Adding these number: ");
                System.out.println("The result is: " + (num1 + num2));
                break;

            case 1:
                System.out.println("Subtracting these number: ");
                System.out.println("The result is: " + (num1 - num2));
                break;

            case 2:
                System.out.println("Multiplying these number: ");
                System.out.println("The result is: " + (num1 * num2));
                break;

            case 3:
                System.out.println("Divising these number: ");
                System.out.println("The result is: " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid input!");
        }

    }

}
