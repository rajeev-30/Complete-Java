package OOPS;

public class PolyMorphism_sample {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rajeev";
        p1.age = 18;

        Person p2 = new Person();
        p2.name = "KuchhBhi";
        p2.age = 18;

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);

        p1.eat();
        p2.walk(6);
    }

}

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }
}
