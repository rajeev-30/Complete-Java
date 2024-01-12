package BASICS;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String input = scan.nextLine();
        System.out.println(input);

        System.out.println("Enter a number: ");
        int s = scan.nextInt();
        System.out.println(s);
        scan.close();

    }

}