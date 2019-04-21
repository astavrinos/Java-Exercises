import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int randomNum = rand.nextInt(100);
		
		System.out.println("Cheats initiated: " + randomNum);
		
		Scanner x = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int numberGuess = x.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			if (numberGuess == randomNum) {
				System.out.println("You find it! It took you " + i + " tries!");
				break;
			} else if (numberGuess >= randomNum) {
				System.out.println("Try again. You used " + i + " out of 10. Is less than for sure. Try again now: ");
				numberGuess = x.nextInt();
			} else if (numberGuess <= randomNum) {
				System.out.println("Try again. You used " + i + " out of 10. Is bigger than for sure. Type now your number: ");
				numberGuess = x.nextInt();
			} 
		}
	}
}
