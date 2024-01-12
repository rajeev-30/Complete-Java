package OOPS;

class myThr extends Thread {
    public myThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thank you");
    }
}

public class Thread_Constructors {
    public static void main(String[] args) {
        myThr t = new myThr("Rajeev");
        myThr t2 = new myThr("Kushwaha");
        t.start();
        t2.start();

        System.out.println("The id of thread t is " + t.getId());
        System.out.println("The name of thread t is " + t.getName());
        System.out.println("The id of thread t is " + t2.getId());
        System.out.println("The name of thread t is " + t2.getName());
    }

}
