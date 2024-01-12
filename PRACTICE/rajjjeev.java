package PRACTICE;

import java.util.Scanner;

class marks {
    float java;
    float c;
    float dsa;
    float dbms;
    float python;

    public void printDetail() {
        float sum = (java + c + dsa + dbms + python);
        float per = sum / 5;

        System.out.println("Total: " + sum);
        System.out.println("Percentage: " + per);
    }
}

public class rajjjeev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        marks m1 = new marks();

        System.out.println("Enter the marks of java: ");
        m1.java = scan.nextInt();
        System.out.println("Enter the marks of c: ");
        m1.c = scan.nextInt();
        System.out.println("Enter the marks of dsa: ");
        m1.dsa = scan.nextInt();
        System.out.println("Enter the marks of dbms: ");
        m1.dbms = scan.nextInt();
        System.out.println("Enter the marks of python: ");
        m1.python = scan.nextInt();

        m1.printDetail();

    }

}