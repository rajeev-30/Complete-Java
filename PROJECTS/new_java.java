package PROJECTS;

import java.util.Random;
import java.util.Scanner;

class NewJava {
    public void s1(String n, int m) {

    }
}

public class new_java {
    public static void main(String[] args) {

        String arr[] = { "intent", "phoenix", "stunned", "regardless", "disclaimer", "substitute", "ruined",
                "i have been here since first year" };
        int len = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want: ");
        int w = sc.nextInt();

        for (int j = 0; j < w; j++) {

            if (w > len) {
                System.out.println("sorry! we don't have so many words");
                return;
            }

            Random rand = new Random();
            int ran_num = rand.nextInt(0, len - 1);
            System.out.print(arr[ran_num] + ", ");

        }
    }
}
