package CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Rate this app: ");
        int rating = scan.nextInt();
        scan.close();

        switch (rating) {
            case 1:
                System.out.println("You rated this app: 1");
                break;
            case 2:
                System.out.println("You rated this app: 2");
                break;
            case 3:
                System.out.println("You rated this app: 3");
                break;
            case 4:
                System.out.println("You rated this app: 4");
                break;
            case 5:
                System.out.println("You rated this app: 5");
                break;

            default:
                System.out.println("invalid! please give within 1 - 5 rating");
                break;
        }
    }

}
