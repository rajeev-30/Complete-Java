package EVALUATION_3;

class Base {
    public void calculate(int a) {
        System.out.println("this is the Base class method with parameter: " + a);
    }
}

class Child {
    public void calculate(int a) {
        System.out.println("this is the Child class method with parameter: " + a);

    }
}

public class Que_02 {
    public static void main(String[] args) {
        Base p = new Base();
        p.calculate(6);

        Child  d = new Child();
        d.calculate(4);
    }

}
