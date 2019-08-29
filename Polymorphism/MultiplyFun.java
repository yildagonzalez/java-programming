package Polymorphism;

// Java Program for method overloading

class MultiplyFun {
	
	// Method with 2 parameters
	static int Multiply(int a, int b) {
		return a * b;
	}
	
	// Method with the same name but 3 parameters
	static int Multiply(int a, int b, int c) {
		return a * b * c;
	}
	
	// Method with same name, but different type of parameters
	static double Multiply(double a, double b) {
		return a * b;
	}
	
}
