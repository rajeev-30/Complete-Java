package OOPS;

class Base1 {
    int x;

    Base1() {
        System.out.println("I am a Constructor");
    }

    Base1(int a) {
        System.out.println("I am an overload Base1 Constructor: " + a);
    }
}

class Drived1 extends Base1 {
    int y;

    Drived1() {
        super();
        System.out.println("I am a Drived class constructor");
    }

    Drived1(int x, int y) {
        super(y);
        System.out.println("I am an overload Drived1 Constructor: " + y);
    }
}

public class Constructors_in_InHeritance {
    public static void main(String[] args) {

        Base1 b1 = new Base1();
        Drived1 d1 = new Drived1(4, 6);
    }

}
