package OOPS;

class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 6; // without modifire
    private int a = 78;

    void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); ---> error because of private modifire

    }

}
