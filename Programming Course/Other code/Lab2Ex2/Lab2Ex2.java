
public class Lab2Ex2 {
	public static void main(String[] args) {
		String a = "Hello"; //This is a String
		String b = "UoG"; //This is a String
		int c = 5; //This is an int. We've made c to be 5
		double d = 3.2; //This is a double (e.g 1.5). We've made d to be 3.2
		//double pi = 3.14125; //Creating double variable in ONE line
		
		//double pi;	//Creating double variable
		//pi = 3.14125;	//in two lines
		
		//System.out.println(pi); //Prints the pi value
		
		System.out.println(d); //This line will print the double of the value d. Which is 3.2
		System.out.println(b); //This line will pring the String of the value b. Which is UoG
		
		/*
		Here we are telling Java to convert d which is a double variable to an int and to store the result in the variable 		"c". As a result d will become from 3.2 to 3. F.Y.I: If you change the d to 3.9 for example you will not get 4, you 		will still get 3. In conclution it get's rounded down-words no matter what.
		*/
		
		c = (int) d;
		System.out.println(c);
		
		//String f = (String) d; //At this line you can not cast (METATOPISI) from double to String
		
	}//end of main
}//end of class