//Reference: https://stackoverflow.com/questions/1021324/java-code-for-calculating-leap-year
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Please enter the year: ");
		int year = x.nextInt(); //here we enter the year value
		
		CheckingLeapYear(year); //here we call the method CheckingLeapYear
		
	}//end of main
	public static boolean CheckingLeapYear(int year) {
		//values
		boolean isLeapYear;
		int equation = year % 4;
		int equation2 = year % 100;
		int equation3 = year % 400;
		
		//Here we can check if is leap year
		if ((equation == 0) && equation2 != 0) {
			isLeapYear = true;
			System.out.println(year + " is a leap year.");
		} else if ((equation == 0) && (equation2 == 0) && (equation3 == 0)) {
			isLeapYear = true;
			System.out.println(year + " is a leap year.");
		} else {
			isLeapYear = false;
			System.out.println(year + " is not a leap year.");
		}
		return isLeapYear;		
	
	}//end of CheckingLeapYear
}//end of class