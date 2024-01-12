package OOPS;

class Phone {

    public void greet() {
        System.out.println("Good morning");
    }

    public void on() {
        System.out.println("turning on phone...");
    }
}

class SmartPhone extends Phone {

    public void swagat() {
        System.out.println("Aapka swagat hai");
    }

    public void on() {
        System.out.println("turning on Smartphone...");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // SmartPhone smobj = new SmartPhone();
        // obj.name();

        Phone obj = new SmartPhone();
        obj.greet();
        obj.on();
    }

}
