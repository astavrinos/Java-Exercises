/*
 * Each object is pointing to one value which is age. So if this object change like we 
 * did below it will change for everyone. Reka is 21 years old so that means Bill becomes
 * from 57 to 21 because we changed that value. 
 */


public class RefFun {

	public static void main(String[] args) {
		Person personOne = new Person("Bill",56);
		Person personTwo = personOne;// personTwo equals with personOne values
		
		
		personTwo.sayHello();// prints the method
		
		personTwo.setAge(57);// change the int value of person to (setting the age)
		personTwo.sayHello();// prints the new method with the new value
		
		Person personThree = new Person("reka",21);
		personThree.sayHello();
		
		personOne.sayHello();// prints the values of personOne which is equals with the value get.age
	}// end of main

}// end of class
