public class MathimaticalOp {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 12;
		int d = c * (a + b);
		int e = c * a + b;
		int f = c / a;
		double g = c / a;
		double h = (double) c / a;
		int i = c % a;
		
		System.out.println("This is d value: " + d);
		System.out.println("This is e value: " + e);
		System.out.println("This is f value: " + f);
		System.out.println("This is g value: " + g);
		System.out.println("This is h value: " + h);
		System.out.println("This is i value: " + i);
		
		
		//int c = (int) (a + 8); //This is how it converts from double to int
		
		//System.out.println(c);
		
	}// End of main
}// End of class