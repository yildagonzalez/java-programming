package Polymorphism;

/*
 	Polymorphism can also be achieved by OPERATOR OVERLOADING
 	We can make the operator ('+') for string class to concatenate
 	two string. A single operator '+' when placed between integer operands, 
 	adds them and when places between string operands, concatenates them.
 	
 	In Java, Only "+" operator can be overloaded:
 	
 	- To add integers
 	- To concatenate strings
 	
*/
class OperatorOVERDDN {

	void operator(String str1, String str2) {
		
		String s = str1 + str2;
		System.out.println("Concatinated String - " + s);
	}
	
	void operator(int a, int b) {
		
		int c = a + b;
		System.out.println("Sum = " + c);
	}
	
	
	
}
