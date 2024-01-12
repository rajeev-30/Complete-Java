package PRACTICE;

import java.util.Scanner;

class AddNumber {
    int num1, num2, num3;

    public int display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first Number");
        num1 = sc.nextInt();
        System.out.println("enter the  second Number");
        num2 = sc.nextInt();
        return 0;
    }

    public int result() {
        num3 = num1 + num2;
        System.out.println(num3);
        return 0;
    }
}

public class Practice6 {
    public static void main(String[] args) {
        AddNumber n1 = new AddNumber();
        n1.display();
        n1.result();
    }
}