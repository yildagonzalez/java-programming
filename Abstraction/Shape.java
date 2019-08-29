package Abstraction;
 // Java program to illustrate the 
// concept of abstraction

// Only essential details are displayed to the user. 
abstract class Shape {
	
	String color;
	
	// these are abstract methods
	abstract double area();
	public abstract String toString();
	
	/* 
	 
	1. An abstract class is a class that is declared with abstract keyword.
	2. An abstract method is a method that is declared without an implementation.
	3. An abstract class may or may not have all abstract methods. Some of them can be concrete methods
	4. A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
	5. Any class that contains one or more abstract methods must also be declared with abstract keyword.
	6. There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
	7. An abstract class can have parametized constructors and default constructor is always present in an abstract class.
	 
	 
	*/
	 
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}
	
	
	// this is a concrete method (it had a complete definition)
	// but it can be overridden in the inherited class, unless we
	// make it 'final'
	
	public String getColor() {
		return color;
	}
	
}	
