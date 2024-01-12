package EVALUATION02;

class Show {

    Show() {
        System.out.println("Non parameterized constructor");
    }

    Show(String str) {
        System.out.println("parameterized constructor: " + str);
    }

    Show(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        System.out.println("Sum: " + sum);
    }
}

public class Que_02 {
    public static void main(String[] args) {
        Show s1 = new Show();
        Show s2 = new Show("Done");
        Show s3 = new Show(5, 6, 7);
    }

}
