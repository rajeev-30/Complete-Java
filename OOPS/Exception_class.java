package OOPS;

import java.util.Scanner;

class myException extends Exception {
    @Override
    public String toString() {
        return "  I am toString";
    }

    @Override
    public String getMessage() {
        return "  I am getMessage";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        if (a < 90) {
            try {
                throw new myException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }

        }
    }
}