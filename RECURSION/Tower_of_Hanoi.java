package RECURSION;

public class Tower_of_Hanoi {

    public static void towerOfHonai(int n, String src, String helper, String des) {

        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + des);
            return;
        }

        // src = source; disk = disk; des = destination;
        towerOfHonai(n - 1, src, des, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + des);
        towerOfHonai(n - 1, helper, src, des);
    }

    public static void main(String[] args) {
        // Tower of honai problem
        int n = 5;
        towerOfHonai(n, "S", "H", "D");
    }

}
