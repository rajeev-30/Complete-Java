package PRACTICE;

import java.util.Scanner;

class Emp1oyee {
    int id;
    String name;
    float salary;

    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the id: ");
        id = sc.nextInt();
        System.out.print("Enter the salary: ");
        salary = sc.nextFloat();
    }

    public void display() {
        System.out.println(name + "  " + id + "  " + salary);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Emp1oyee e1 = new Emp1oyee();
        Emp1oyee e2 = new Emp1oyee();
        Emp1oyee e3 = new Emp1oyee();

        e1.insert();
        e2.insert();
        e3.insert();

        System.out.println("Employee details: ");
        e1.display();
        e2.display();
        e3.display();
    }

}
