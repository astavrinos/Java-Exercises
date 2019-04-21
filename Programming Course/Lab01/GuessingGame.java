import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        String submit = "c";

        while (submit.equals("c")) {
            // Creates a random from 1 to 99
            int random = rm.nextInt(100);

            // A for loop to try only 10 times
            for (int i = 0; i < 10; i++) {
                int timesLeft = 9 - i;
                System.out.println("Type a number from 1 - 99: ");
                int userInput = 0;

                // If user typed a letter, try again
                while (true) {
                    try {
                        sc = new Scanner(System.in);
                        userInput = sc.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Type numbers only...");
                    }
                }

                // Check if the number is equal to the random one
                if (random == userInput) {
                    System.out.println("Correct! The number was " + random + ". Times tried: " + i);
                    break;
                } else {
                    System.out.println("Wrong! Times left: " + timesLeft);
                }
            }

            System.out.println("The number was " + random + ". Press q to quit or c to continue with a new number.");
            
            // Check if the user has typed correctly, else try again
            while (true) {
                submit = sc.next();
                if (submit.equals("c") || submit.equals("q")) {
                    break;
                } else {
                    System.out.println("Press q to quit or c to continue with a new number.");
                }
            }
        }
        sc.close();
    }
}