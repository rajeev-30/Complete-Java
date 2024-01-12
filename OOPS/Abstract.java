package OOPS;

abstract class Base12 {

    Base12() {
        System.out.println("Main Base12 ka Constructor hu");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Drived12 extends Base12 {
    public void greet() {
        System.out.println("Good morning!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Base12 b = new Base12(); --- error
        Drived12 d = new Drived12();
        d.greet();
        d.sayHello();

    }

}
