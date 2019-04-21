
public class GetSet {

	public static void main(String[] args) {
		Person personOne = new Person("Bill",56);
		personOne.sayHello();// person above values will be print
		
		personOne.setAge(57);// change the value of age
		personOne.sayHello();// reprint with new values
		
		System.out.println(personOne.getName());// print the name. just the name
	}// end of main

}// end of class
