package OOPS;

class Employee {
    private int id;
    private String name;

    public Employee(String myName, int myId) { // Constructor
        id = myId;
        name = myName;
    }

    public Employee(String myName) { // Constructor overloading
        id = 1;
        name = myName;
    }

    public Employee() { // Constructor overloading
        id = 11;
        name = "yourName";
    }

    public void PrintInfo() { // method
        System.out.println(id);
        System.out.println(name);
    }

    public void PrintInfo(int cgpa) { // method overloading
        System.out.println(name);
        System.out.println(cgpa);
    }

}

public class Constructors {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rajeev", 86);
        e1.PrintInfo();

        Employee e2 = new Employee("Raj33v");
        e2.PrintInfo();

        Employee e3 = new Employee();
        e3.PrintInfo();

        Employee e4 = new Employee();
        e4.PrintInfo(9);

    }

}
