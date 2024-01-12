package OOPS;

class Ekclass {
    int a;

    public Ekclass(int v) {
        this.a = v;
    }

    public int getA() {
        return a;
    }

}

class Doclass extends Ekclass {

    Doclass(int c) {
        super(c);
        System.out.println("I am a Constructor");
    }
}

public class This_Super_KeyWord {

    public static void main(String[] args) {

        Ekclass e = new Ekclass(30);
        Doclass d = new Doclass(18);

    }

}
