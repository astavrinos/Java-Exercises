import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JFrame;

public class PaperStoneScissors {

	public static void main(String[] args) {
		
		int botInput;
		int i;
		int botWins = 0;
		int userWins = 0;
		
		for (i = 1; i <= 5; i++) {
			
			//user and bot inputs
			String userInput;
			String botInputFinal = null;
			
			//creating random
			Random rand = new Random();
			botInput = rand.nextInt(3) + 1;

			if (botInput == 1) {
				botInputFinal = "paper";
			} else if (botInput == 2) {
				botInputFinal = "stone";
			} else if (botInput == 3) {
				botInputFinal = "scissors";
			}//end of bot rules depending on random value e.g 1 is for paper. converting int to string
			
			// gets the user input
			Scanner x = new Scanner(System.in);
			System.out.println("Round " + i + " of 5. The score is: User " + userWins + " - " + botWins +" Bot. Select your weapon! Type paper, stone or scissors: ");
			userInput = x.nextLine();
			
			if (botInputFinal.equals(userInput)) {
				System.out.println("Draw. Both user and bot choose the same weapon. (" + userInput + ")");
				i--;
				System.out.println();
			} else if (botInputFinal.equals("paper") && userInput.equals("stone")) {
				System.out.println("Bot wins with " + botInputFinal + ". User choose " + userInput + ".");
				botWins = botWins + 1;
				System.out.println();
			} else if (botInputFinal.equals("scissors") && userInput.equals("paper")) {
				System.out.println("Bot wins with " + botInputFinal + ". User choose " + userInput + ".");
				botWins = botWins + 1;
				System.out.println();
			} else if (botInputFinal.equals("paper") && userInput.equals("scissors")) {
				System.out.println("User wins with " + userInput + ". Bot choose " + botInputFinal + ".");
				userWins = userWins + 1;
				System.out.println();
			} else if (botInputFinal.equals("stone") && userInput.equals("paper")) {
				System.out.println("User wins with " + userInput + ". Bot choose " + botInputFinal + ".");
				userWins = userWins + 1;
				System.out.println();
			} else if (botInputFinal.equals("stone") && userInput.equals("scissors")) {
				System.out.println("Bot wins with " + botInputFinal + ". User choose " + userInput + ".");
				botWins = botWins + 1;
				System.out.println();
			} else if (botInputFinal.equals("scissors") && userInput.equals("stone")) {
				System.out.println("User wins with " + userInput + ". Bot choose " + botInputFinal + ".");
				userWins = userWins + 1;
				System.out.println();
			}//end of if else statements
			
			}//end of for
		
			if (userWins > botWins) {
				System.out.println("User wins with " + userWins + " wins.");
			} else {
				System.out.println("Bot wins with " + botWins + " wins.");
			}//end of score count win
			
			JFrame f = new JFrame();
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setSize(500, 500);
	        f.setVisible(true);
			
	}//end of main
	
}//end of class