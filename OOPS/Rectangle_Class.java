package OOPS;

class Rectangle {
    int length;
    int width;

    public int area() {
        return length * width;
    }

    public float perimeter() {
        return 2 * (length + width);
    }
}

public class Rectangle_Class {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.width = 6;

        System.out.println(r1.area());
        System.out.println(r1.perimeter());

    }

}
