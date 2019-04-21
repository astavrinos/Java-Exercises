import java.util.Scanner;

public class Lab6Ex7 {

	public static void main(String[] args) {
		double a, b, divide, reminder;
		
		Scanner x = new Scanner(System.in);
		System.out.println("Please enter number A: ");
		double userNum1 = x.nextDouble(); //here we enter the year value
		
		a = userNum1;
		
		System.out.println("Please enter number B: ");
		double userNum2 = x.nextDouble(); //here we enter the year value
		
		b = userNum2;
		
		divide = Math.round(a / b); //quotient
		reminder = a % b; //reminder
		
		System.out.println("The result of the division of those numbers is " + divide + ", and the reminder is " + reminder);
	}

}