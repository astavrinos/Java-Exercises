import java.util.Scanner;

public class Lab6Ex8 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String userInput = x.nextLine();
		int length = userInput.length();
		
		System.out.println("Enter a character: ");
		String userInChar = x.nextLine();
		
		for (int i = 1; i <= length; i++) {
			System.out.print(userInChar);
		}

	}

}
