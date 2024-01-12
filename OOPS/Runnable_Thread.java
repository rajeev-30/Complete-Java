package OOPS;

class myThreadRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("I am a thred 1 not a threat 1");
        }
    }
}

class myThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("I am a thred 2 not a threat 2");
        }
    }
}

public class Runnable_Thread {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }

}
