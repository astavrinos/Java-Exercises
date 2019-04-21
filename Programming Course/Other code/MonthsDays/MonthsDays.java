import java.util.Scanner;

public class MonthsDays {
	public static void main(String[] args) {
		
		//boolean temp = isLeapiYear(year)
		
		Scanner inputY = new Scanner(System.in);
		System.out.println("Please enter the year: ");
		int userYearInput = inputY.nextInt();
		
		Scanner inputM = new Scanner(System.in);
		System.out.println("Please enter the month with only 3 letters (e.g April will be Apr): ");
		String userInput = inputM.nextLine();
		
		CheckingLeapYear(userYearInput);
		MonthIn(userInput, userYearInput);
	
	}//end of main
	
	public static boolean CheckingLeapYear(int inputY) {
		//values
		boolean isLeapYear;
		int equation = inputY % 4;
		int equation2 = inputY % 100;
		int equation3 = inputY % 400;
		
		//Here we can check if is leap year
		if ((equation == 0) && equation2 != 0) {
			isLeapYear = true;
			//System.out.println(inputY + " is a leap year.");
		} else if ((equation == 0) && (equation2 == 0) && (equation3 == 0)) {
			isLeapYear = true;
			//System.out.println(inputY + " is a leap year.");
		} else {
			isLeapYear = false;
			//System.out.println(inputY + " is not a leap year.");
		}
		return isLeapYear;		
	}//end of CheckingLeapYear
	
	public static String MonthIn(String inputM, int inputY) {
		String processedMonth = null;
		String Jan = "Jan", Feb = "Feb", Mar = "Mar", Apr = "Apr", May = "May", Jun = "Jun", Jul = "Jul", Aug = "Aug", Sep = "Sep", Oct = "Oct", Nov = "Nov", Dec = "Dec"; 
		
		//boolean isLeapYear;
		boolean LeapYear = CheckingLeapYear(inputY);
		if (inputM.equals(Jan) || inputM.equals(Mar) || inputM.equals(May) || inputM.equals(Jul) || inputM.equals(Aug) || inputM.equals(Oct) || inputM.equals(Dec)) {
			System.out.println("The month " + inputM + " has 31 days on the year " + inputY + ".");
		} else if (inputM.equals(Apr) || inputM.equals(Jun) || inputM.equals(Sep) || inputM.equals(Nov)) {
			System.out.println("The month " + inputM + " has 30 days on the year " + inputY + ".");
		} else if (inputM.equals(Feb) && CheckingLeapYear(inputY) == false) {
			System.out.println("The month " + inputM + " has 28 days on the year " + inputY + ".");
		} else if (inputM.equals(Feb) && CheckingLeapYear(inputY) == true) {
			System.out.println("The month " + inputM + " has 29 days on the year " + inputY + ".");
		}else {
			System.out.println("You did not follow the rules.");
		}
		
		return processedMonth;
	}//end of MonthIn
}//end of class
