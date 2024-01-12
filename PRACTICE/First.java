package PRACTICE;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Enter target: ");
        int target = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("index no. " + i);
                return;
            }
        }
        System.out.println("element not present in an array!");
    }
}
