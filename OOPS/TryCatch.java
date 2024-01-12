package OOPS;

public class TryCatch {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Execution failed, Reason: ");
            System.out.println(e);
        }
        System.out.println("End of program!");
    }

}
