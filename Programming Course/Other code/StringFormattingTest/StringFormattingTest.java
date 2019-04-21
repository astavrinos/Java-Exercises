import java.util.Scanner;

public class StringFormattingTest {

	public static void main(String[] args) {
		// Double values
		double userNumInput;
		int userTimesMulInput;
		
		// Here we ask from the user to give the number that wants to multiply
		Scanner actualNum = new Scanner(System.in);
		System.out.println("Please enter the number you want to multiply: ");
		userNumInput = actualNum.nextDouble();

		// Here we ask from the user to import how many times he needs to be multiply
		Scanner actualTimes = new Scanner(System.in);
		System.out.println("Please enter how many times to multiply: ");
		userTimesMulInput = actualTimes.nextInt();
		
		// Calls the timesMethod
		timesMethod(userNumInput, userTimesMulInput);

	}//end of main
	public static double timesMethod(double timesNum, int timesMul) {
		
		for (int i = 1; i <= timesMul; i++) {
			String line = String.format("%-3s x %-3d",timesNum,i);
			double result = timesNum * i;
			System.out.println(line + " = " + result);
			//System.out.println(i + " x " + timesNum + " = " + (i * timesNum));
		}
		return timesNum;
		
	}//end of for
}//end of class
