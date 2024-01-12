package PRACTICE;

class Emp1oyeee {
    String name;

    Emp1oyeee(String name) {
        this.name = name;
        // System.out.println(name);
    }

    Emp1oyeee() {
        name = "Unknown";
        // System.out.println(name);
    }

    void printName() {
        System.out.println(name);
    }
}

public class Practice5 {
    public static void main(String[] args) {

        Emp1oyeee e1 = new Emp1oyeee("Alicia");
        Emp1oyeee e2 = new Emp1oyeee();
        Emp1oyeee e3 = new Emp1oyeee("Raquel");
        Emp1oyeee e4 = new Emp1oyeee();

        e1.printName();
        e2.printName();
        e3.printName();
        e4.printName();
    }

}
