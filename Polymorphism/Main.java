package Polymorphism;

// Polymorphism is achieved by overloading methods
// There can be multiple functions with the same name but different
// parameters. They can also be overloaded by change in number of arguments,
// or/and change in type or arguments

// This is called COMPILE TIME POLYMORPHISM(static polymorphism)

// In this example, we are achieving polymorphism by overloading
// the methods by a change in number of arguments
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(MultiplyFun.Multiply(2, 4));

        System.out.println(MultiplyFun.Multiply(2, 7, 3)); 
        
        System.out.println(MultiplyFun.Multiply(3.2, 1.0));
        
        OperatorOVERDDN obj = new OperatorOVERDDN();
        obj.operator(2, 3);
        obj.operator("Yilda", " is great");
	}
}
