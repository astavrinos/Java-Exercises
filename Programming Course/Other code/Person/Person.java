public class Person {
	// two attributes
	public String name;
	public static int age; // age is now
	// a constructor
	public Person(String s, int a) {
		name = s;
		age = a;
	}
	// getter for age
	public int getAge() {
		return age;
	}
	// getter for name
	public String getName() {
		return name;
	}
	// setter for age
	public void setAge(int a) {
		age = a;
	}
	// setter for name
	public void setName(String n) {
		name = n;
	}
	// a method
	public void sayHello( ) {
		System.out.println("Hi, I'm " + name + " and I am " + age + " years old.");
	}
}//end of class