package PROJECTS;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        int score = 0;
        int os = 0;

        Scanner sc = new Scanner(System.in);
        // if random_num is 0 = Rock, 1 = Paper, 2 = Scissor;
        String prompt = "Enter 0 for Rock, 1 for Paper, 2 for Scissor";
        String note = "This game will play 5 times";

        System.out.print("\nNote ---> " + note);
        System.out.println("\n" + prompt);
        int i = 0;

        while (i < 5) {

            int random_num = (int) (Math.random() * 3);

            System.out.print("\nEnter your number: ");
            int num = sc.nextInt();

            if (random_num == num) {
                System.out.println("Opponent number: " + random_num);
                System.out.println("Drawn!!!");

            } else if (random_num == 0 && num == 2 || random_num == 1 && num == 0 || random_num == 2 && num == 1) {
                System.out.println("Opponent number: " + random_num);
                System.out.println("You lost!");
                os++;

            } else if (num == 0 && random_num == 2 || num == 1 && random_num == 0 || num == 2 && random_num == 1) {
                System.out.println("Opponent number: " + random_num);
                System.out.println("WOHOOO...You Winnn");
                score++;

            }
            // If UseR ChosE WronG NumbeR
            else if (num > 2) {
                System.out.println("\nYou have to Enter between (0 to 2)");
                i--;
            }
            i++;
        }

        System.out.println("\nYour score is: " + score);
        System.out.println("Your opponent score is: " + os);

    }

}
