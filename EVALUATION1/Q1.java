package EVALUATION1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int l = size / 2;

        for (int i = 0; i < l; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1];
            arr[size - 1] = temp;
            size--;
        }

        System.out.println("Reverse array is: ");
        for (int element : arr) {
            System.out.println(element);
        }

    }

}
