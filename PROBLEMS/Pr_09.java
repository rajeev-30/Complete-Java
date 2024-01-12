package PROBLEMS;

class Circle {
    int radius;

    Circle() {
        System.out.println("I am non param constructor");
    }

    Circle(int r) {
        System.out.println("I am Circle parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    int height;

    Cylinder(int r, int h) {
        super(r);
        System.out.println("I am Cylinder parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class Pr_09 {
    public static void main(String[] args) {
        // Create a class Circle and use inheritance to create another class Cylinder
        // from it;

        // Circle obj = new Circle();
        Cylinder obj1 = new Cylinder(12, 4);

    }

}
