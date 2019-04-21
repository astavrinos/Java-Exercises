import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {

		int userNumInput;
		int userTimesMulInput;
		
		Scanner actualNum = new Scanner(System.in);
		System.out.println("Please enter the number you want to multiply: ");
		userNumInput = actualNum.nextInt();

		Scanner actualTimes = new Scanner(System.in);
		System.out.println("Please enter how many times to multiply: ");
		userTimesMulInput = actualTimes.nextInt();
		
		timesMethod(userNumInput, userTimesMulInput);

	}//end of main
	public static int timesMethod(int timesNum, int timesMul) {
	
		for (int i = 1; i <= timesMul; i++) {
		System.out.println(i + " x " + timesNum + " = " + (i * timesNum));
		}
		return timesNum;
		
	}//end of for
}//end of class