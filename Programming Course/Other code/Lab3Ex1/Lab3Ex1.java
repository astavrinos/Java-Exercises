import java.util.Scanner;

public class Lab3Ex1 {
	public static void main(String[] args) {
		
		Scanner keyboard  = new Scanner (System.in);
		System.out.println("Please enter your name, followed by the return key.");
		String userEntry = keyboard.nextLine();
		System.out.println("Please enter your Age.");
		int userAge = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Hello " + userEntry + ". You are " + userAge + " years old. But you know that already.");
		
	}
}
