
public class Test {

	public static void main(String[] args) {
		// make a person
		Person personOne = new Person("Adamos",24);
		// we can call its method:
		personOne.sayHello();
		// we can also access its attributes
		System.out.println(personOne.name);
		// or set them
		personOne.age = 24;
		personOne.sayHello();
		// we can make another now
		Person personTwo = new Person("Dulce",25);
		personTwo.sayHello();
	}// end of main

}//end of class
