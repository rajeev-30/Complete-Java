package CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class IF_Else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.close();

        if (age > 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you cannot vote!");
        }
    }

}
