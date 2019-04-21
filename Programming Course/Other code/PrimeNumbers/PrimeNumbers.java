//reference: https://stackoverflow.com/questions/14650360/very-simple-prime-number-test-i-think-im-not-understanding-the-for-loop

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int userPrimeInput = inputNum.nextInt();
		
		isPrime(userPrimeInput);

	}//end of main

	public static boolean isPrime(int n) {
	    int i;
	    for (i = 2; i <= n / 2; i++) {
	        if (n % i == 0) {
	        	System.out.println(n + " is not a prime number.");
	            return false;
	        }
	    }
	    System.out.println(n + " is prime number.");
	    return true;

	}//end of isPrime

}//end of class
