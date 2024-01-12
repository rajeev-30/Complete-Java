package OOPS;

interface Bicycle { // ---------> interface 1
    int a = 30;

    void applyBreak(int decrement);

    void speedUp(int increment);
}

interface horn { // ---------> interface 2

    void hornBicycle();
}

class heroCycle implements Bicycle, horn {
    public void applyBreak(int decrement) {
        System.out.println("Applying break");
    }

    public void speedUp(int increment) {
        System.out.println("Applying speedUp");
    }

    public void hornBicycle() {
        System.out.println("pee pee pee peee...");
    }
}

public class InterFaces {
    public static void main(String[] args) {
        heroCycle h1 = new heroCycle();

        h1.applyBreak(1);
        h1.hornBicycle();

        System.out.println(h1.a);
    }

}
