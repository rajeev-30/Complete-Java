package OOPS;

class A {
    int a;

    public int meth1() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am a method 2 of class A");
    }
}

class B extends A {
    @Override // (Override notation)
    public void meth2() { // method overriding
        System.out.println("I am a method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am a method 3 of class B");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }

}
