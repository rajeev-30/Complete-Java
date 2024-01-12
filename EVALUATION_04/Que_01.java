package EVALUATION_04;

import java.util.Scanner;

class Parent {
    int empid;
    String name;
    int salary;
    String city;

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the emp id: ");
        empid = sc.nextInt();
        System.out.println("Enter the emp name: ");
        name = sc.next();
    }

    public void print() {
        System.out.println("emp id: " + empid);
        System.out.println("emp name: " + name);

    }

}

class Child extends Parent {

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        salary = sc.nextInt();
        System.out.println("Enter the city: ");
        city = sc.next();
    }

    public void print2() {
        System.out.println("emp salary: " + salary);
        System.out.println("emp city: " + city);

    }
}

public class Que_01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.userInput();

        Child c = new Child();
        c.input();

        p.print();
        c.print2();

    }

}
