package OOPS;

class Base {
    int x;

    public void print() {
        System.out.println("Print: " + x);
    }
}

// Inherite Base class into Drived class;
class Drived extends Base {

}

public class Inheritance {

    public static void main(String[] args) {

        // Creating an object of Base class
        Base b = new Base();
        b.x = 4;
        b.print();

        // Creating an object of Drived class
        Drived d = new Drived();
        d.x = 4;
        d.print();

    }

}
