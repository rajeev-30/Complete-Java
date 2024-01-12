package PROJECTS;

import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {
        // int random_num = (int) (Math.random() * 100); //This is also correct for
        // generating random number

        Random rand = new Random();
        int random_num = rand.nextInt(100);
        // System.out.println(random_num);

        System.out.println("Guess the number between (1 to 100) --->");

        Scanner sc = new Scanner(System.in);
        int my_num;

        // sc.close();

        for (int i = 0; i < 100; i++) {
            System.out.print("\nGuess the number: ");
            my_num = sc.nextInt();

            if (random_num == my_num) {
                System.out.println("WOHOO!....Your number is correct");
                break;
            }

            // else if(my_num<0){
            // System.out.println("You have entered WRONG input"); --------> optional <-----
            // break;
            // }

            else if (random_num > my_num) {
                System.out.println("Your number is too samll");
            }

            else {
                System.out.println("Your number is too large");
            }
        }

    }

}
