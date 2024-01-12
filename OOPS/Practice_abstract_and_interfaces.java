package OOPS;

// Q1
abstract class Pen {
    abstract void write();

    abstract void refill();
}

class gelPen extends Pen {
    public void write() {
        System.out.println("Write");
    }

    public void refill() {
        System.out.println("refill");
    }

    public void changeNib() {
        System.out.println("changing nib");
    }
}

// Q2
class Monkey {
    void jump() {
        System.out.println("jumping...");
    }

    void bite() {
        System.out.println("biting...");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("hello sir");
    }

    public void eat() {
        System.out.println("eating");
    }

    public void sleep() {
        System.out.println("sleeping");
    }
}

public class Practice_abstract_and_interfaces {
    public static void main(String[] args) {
        // gelPen g1 = new gelPen();
        // g1.refill();

        // polymorphism
        Pen p = new gelPen();
        p.refill();

        // polymorphism
        Monkey m = new Human();
        m.bite();
    }

}
