package PRACTICE;

import java.util.Scanner;

public class Practice {
    public static void a(int x) {
        System.out.println(x);
    }

    public static void a(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values: ");
        int z = sc.nextInt();
        int y = sc.nextInt();
        
        a(z);
        a(z, y);
    }
}
