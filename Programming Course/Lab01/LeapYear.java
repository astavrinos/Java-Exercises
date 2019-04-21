/*
* A simple program which calculates if a year is a leap year.
* Author: Adamos Stavrinos
*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear main = new LeapYear();
        Scanner sc = new Scanner(System.in);

        // Using try catch just in case the user input any letters
        while(true) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Enter year: ");
                int userInput = sc.nextInt();
                main.calculation(userInput);
            } catch (Exception e) {
                System.out.println("No letters please...");
            }
        }
    }

    /*
    * This function will check if the year is a leap year.
    * Some requirements needs to be met is:
    * 1) The year is evenly divisable by 4 AND not evenly divisable by 100.
    * 2) A year is a leap year also if is divisable evenly by 100 AND 400.
    */
    public void calculation(int a) {
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 100 == 0) && (a % 400 == 0)) {
            System.out.println("The year " + a + " is a leap year. To quit press CTRL + C.");
        } else {
            System.out.println("The year " + a + " is NOT a leap year. To quit press CTRL + C.");
        }
    }
}