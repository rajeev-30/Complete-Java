package CA1;

import java.util.Scanner;

class marksDetail {

    float java;
    float c;
    float dsa;
    float dbms;
    float python;

    public void userInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the marks of java: ");
        java = scan.nextInt();
        System.out.println("Enter the marks of c: ");
        c = scan.nextInt();
        System.out.println("Enter the marks of dsa: ");
        dsa = scan.nextInt();
        System.out.println("Enter the marks of dbms: ");
        dbms = scan.nextInt();
        System.out.println("Enter the marks of python: ");
        python = scan.nextInt();
    }

    public void printInfo() {
        float sum = (java + c + dsa + dbms + python);
        float per = sum / 5;

        System.out.println("Total: " + sum);
        System.out.println("Percentage: " + per);
    }
}

public class Q_5 {
    public static void main(String[] args) {

        marksDetail s1 = new marksDetail();

        s1.userInput();
        s1.printInfo();
    }

}
