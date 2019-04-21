public class PieSplitter {

	public static void main(String[] args) {
		int numberOfPies = 10;
		int numberOfPeople = 10;
		int piesEach = numberOfPies / numberOfPeople;
		int leftOver = numberOfPies - numberOfPeople;
		
		System.out.println("There are " + piesEach + " pies each, and " + leftOver + " left over.");
	}

}
