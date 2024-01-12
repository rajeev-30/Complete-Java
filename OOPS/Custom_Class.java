package OOPS;

class Student {
    int id;
    float cgpa;
    String name;

    public void PrintInfo() {
        System.out.println("My name is " + name);
        System.out.println("My id is " + id);
        System.out.println("My CGPA is " + cgpa);
    }

    public int roll() {
        return id;
    }

}

public class Custom_Class {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 86;
        s1.cgpa = 9.5f;
        s1.name = "Rajeev";

        s1.PrintInfo();
        System.out.println("id : " + s1.roll());

    }

}
