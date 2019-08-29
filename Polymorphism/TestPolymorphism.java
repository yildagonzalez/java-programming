package Polymorphism;


/* 
Runtime polymorphism: It is also known as Dynamic Method Dispatch. 
It is a process in which a function call to the overridden method is resolved at Runtime. 
This type of polymorphism is achieved by Method Overriding.

Method overriding, on the other hand, occurs when a derived class has a definition 
for one of the member functions of the base class. That base function is said to be overridden.

*/


public class TestPolymorphism {
	
	public static void main(String[] args) {
		
		Parent a;
		
		a = new Parent();
		a.print();
		
		a = new Subclass1();
		a.print();
		
		a = new Subclass2();
		a.print();
	}

	
}
