public class CircleArea {
	
	public static void main(String[] args) {
		double r = 5.6;
		summariseCircle(r);
	}//end of main
	
	public static double compArea(double radius) {
		double pi = 3.1415;
		double area = pi * radius * radius;
		return area;
		
	}//end of compArea
	
	public static double compCircumference(double radius) {
		double pi = 3.1415;
		double circumference = 2 * pi * radius;
		return circumference;
	}//end of compCircumference
	
	public static void summariseCircle(double radius) {
		double compArea = compArea(radius);
		double compCircumference = compCircumference(radius);
		System.out.println("The area of the circle is " + compArea + " and the circumference of the circle is " + compCircumference + ".");
	}//end of summariseCircle
	
}//end of class