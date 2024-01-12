package PRACTICE;

import java.util.Scanner;

public class kuchh_bhi {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int num = sc.nextInt();
      int table = 0;
      if (num % 2 == 0) {
         for (int i = 1; i <= 10; i++) {
            table = num * i;
            System.out.format("\n%d x %d = %d", num, i, table);
         }
      } else
         System.out.println("number is odd!");
   }

}
