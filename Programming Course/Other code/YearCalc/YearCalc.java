import java.util.Scanner;

public class YearCalc {
	public static void main(String[] args) {
		int resultDay, resultMonth, resultYear;
		
		Scanner day = new Scanner(System.in);
		System.out.println("Please enter todays day: ");
		int userDayInput = day.nextInt();
		
		Scanner month = new Scanner(System.in);
		System.out.println("Please enter todays month: ");
		int userMonthInput = month.nextInt();
		
		Scanner year = new Scanner(System.in);
		System.out.println("Please enter todays year: ");
		int userYearInput = year.nextInt();
		
		Scanner birthD = new Scanner(System.in);
		System.out.println("Please enter your birthday day: ");
		int userBirthDayInput = birthD.nextInt();
		
		Scanner birthM = new Scanner(System.in);
		System.out.println("Please enter your birthday month: ");
		int userBirthMonthInput = birthM.nextInt();
		
		Scanner birthY = new Scanner(System.in);
		System.out.println("Please enter your birthday year: ");
		int userBirthYearInput = birthY.nextInt();

		resultYear = userYearInput - userBirthYearInput;
		
		if (userDayInput >= userBirthDayInput && userMonthInput >= userBirthMonthInput ) {
			System.out.println("Calculating! Almost there...");
		} else if (userDayInput <= userBirthDayInput && userMonthInput <= userBirthMonthInput) {
			--resultYear;
		}

		System.out.println("You are " + resultYear + " years old!");
	}
}
