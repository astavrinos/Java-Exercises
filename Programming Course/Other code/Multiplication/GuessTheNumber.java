import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		Scanner userNum = new Scanner(System.in);
		System.out.println("Guess the Number! You have 10 tries to guess the number which is from 1-100. Enter a number to start the game!");
		int userNumInput = userNum.nextInt();
		
		Random rand = new Random();
		int randomNum = rand.nextInt(100);

		System.out.println(randomNum);
		
		for (int i = 1; i == 10; i++) {
			if (randomNum == userNumInput) {
				System.out.println("You found it! Congratulations! The number was " + randomNum + "!");
			} else {
				System.out.println("Sorry. Try again.\nTries remaining: " + i + "/10");
			}
		}
		
	}

}
