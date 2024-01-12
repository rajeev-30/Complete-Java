package RECURSION;

public class Reverse_String {

    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {
        // Print String in reverse;
        String str = "Rajeev";
        printRev(str, str.length() - 1);
    }

}
