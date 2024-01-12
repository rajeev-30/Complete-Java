package PRACTICE;

import java.util.Scanner;

class Calculate {
    int num1;
    int num2;

    public void userInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
    }

    public int sum() {
        return num1 + num2;
    }

    public int sub() {
        return num1 - num2;
    }

    public int multi() {
        return num1 * num2;
    }

    public int div() {
        return num1 / num2;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Calculate obj = new Calculate();

        obj.userInput();

        System.out.println("Sum = " + obj.sum());
        System.out.println("Sub = " + obj.sub());
        System.out.println("Multi = " + obj.multi());
        System.out.println("Div = " + obj.div());

    }

}
