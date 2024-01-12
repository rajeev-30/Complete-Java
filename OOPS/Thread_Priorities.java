package OOPS;

class myThr1 extends Thread {

    public myThr1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thank you " + this.getName());
        // while (true) { //---> infinite loop
        // System.out.println("I am a thread");
        // }
    }
}

public class Thread_Priorities {
    public static void main(String[] args) {
        myThr1 t = new myThr1("Rajeev");
        myThr1 t2 = new myThr1("Kushwaha");
        myThr1 t3 = new myThr1("Kushwaha2");
        myThr1 t4 = new myThr1("Kushwaha3 (most important)");
        myThr1 t5 = new myThr1("Kushwaha4");

        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t.getState());// get state of thread
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println(t.getState());// get state of thread
    }

}
