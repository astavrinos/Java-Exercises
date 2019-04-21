public class StringSwapScope {
	public static void main(String[] args) {
		String myString = "this is a test";//this string gets every command in the code
		System.out.println(myString);
		{
			String mySecString = "this is a second test";//this string is implemented only at the line below ONLY.
			System.out.println(mySecString);
		}
		System.out.println(myString); //this can only display a string from the first scope (the beginning of the code)
	}
}