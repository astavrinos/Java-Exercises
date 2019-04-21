//reference: https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-19.php

import java.util.Scanner;

public class NumTriangle {

	public static void main(String[] args) {
		int i, j, spaces, rows, k;
		
		Scanner x = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		rows = x.nextInt();
		spaces = rows + 4 - 1;
		
		for (i = 1; i <= rows; i++) {
			for (k = spaces; k != 1; k--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			spaces--;
		}

	}//end of main

}//end of class
