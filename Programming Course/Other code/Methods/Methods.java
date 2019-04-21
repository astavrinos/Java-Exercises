public class Methods {
	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		int price = bookStore(a, b);
		
		System.out.println("The price for the Book for Love and Book of Action is " + price);
	}//end of main
	public static int bookStore(int firstBook, int secondBook) {
		int myResult = firstBook + secondBook;
		return myResult;
	}//end of bookStore
}//end of class