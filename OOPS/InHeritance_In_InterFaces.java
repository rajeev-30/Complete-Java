package OOPS;

interface sample {

    void meth1();

    void meth2();
}

interface childSample extends sample { // inherite sample interface

    void meth3();

    void meth4();
}

class mySample implements childSample { // We have to declare childSample's methods and
                                        // smaple's methods as well. because childSample inherite
                                        // the sample interface ;
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");

    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");

    }

}

public class InHeritance_In_InterFaces {
    public static void main(String[] args) {
        mySample obj = new mySample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }

}
