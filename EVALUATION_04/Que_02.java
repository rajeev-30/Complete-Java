package EVALUATION_04;

class Student {
    public void get() {
        System.out.println("get() method with no parameter");
    }

    public void get(int a) {
        System.out.println("get() method with 1 parameter: " + a);
    }

    public void get(int a, int b) {
        System.out.println("get() method with 2 parameter: " + a + " and " + b);
    }
}

public class Que_02 {
    public static void main(String[] args) {
        Student s = new Student();
        s.get();
        s.get(4);
        s.get(3, 5);
    }
}
