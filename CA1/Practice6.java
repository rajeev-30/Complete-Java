package CA1;

import java.util.Scanner;

class Emp1oyeee {
    int salary;
    int sum = 0;
    boolean t = true;

    public void input() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the hours of week " + i + ": ");
            arr[i] = sc.nextInt();
            if (arr[i] <= 20) {
                sum += arr[i];
                continue;
            } else {
                System.out.println("You have entred wrong value");
                t = false;
                break;
            }

        }

        if (t) {
            salary = sum * 200;
            System.out.println("");
            System.out.println("per hour: 200rs");
            System.out.println("Total hours: " + sum);
            System.out.println("Total salary: " + salary);
        }
    }

    public void calculate() {

    }
}

public class Practice6 {
    public static void main(String[] args) {
        Emp1oyeee e1 = new Emp1oyeee();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st");

        e1.input();

        // e1.calculate();
    }

}
