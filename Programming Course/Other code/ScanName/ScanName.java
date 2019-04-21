import java.util.Scanner;
public class ScanName {
	public static void main(String[] args) {
		
		String nameAge;
		String name;
		String lastname;
		int age;
		Scanner x = new Scanner(System.in);
		System.out.println("Please enter your name and your age with a space separation");
		nameAge = x.nextLine();
		
		Scanner t = new Scanner(nameAge);
		name = t.next();
		lastname = t.next();
		age = t.nextInt();
		
		System.out.println("Your name is " + name + " and your family name is " + lastname + " and you are " + age + " years old.");
	}
}