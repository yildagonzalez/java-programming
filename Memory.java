
public class Memory {

	private void foo(Object param) { // Line 6 
		String str = param.toString(); //// Line 7
		System.out.println(str); 
	} // Line 8

	public static void main(String[] args) { // Line 1 
		int i=1; // Line 2 
		Object obj = new Object(); // Line 3 
		Memory mem = new Memory(); // Line 4 
		mem.foo(obj); // Line 5 
	} // Line 9
}

/*  
All Runtime classes are loaded into the Heap Space when the program is run.
Java Runtime creates Stack memory to be used by main() method thread when it is found at line 1. 
At line 2, a primitive local variable is created, which is stored in the Stack memory of main() method.
Since an Object is created at line 3, it’s created in Heap memory and the reference for it is stored in Stack memory. 
At line 4, a similar process occurs when a Memory object is created.
When foo() method is called at line 5, a block in the top of the Stack is created for it. 
Since Java is pass by value, a new reference to Object is created in the foo() stack block in line 6.
At line 7, a string is created, which goes in the String Pool in the Heap space, while a reference for it is created in the foo() stack space. 
At line 8, foo() method is terminated, and the memory block allocated for it in the Stack is freed.
Finally, at line 9, main() method terminates, and the Stack memory created for it is destroyed. 
Because the program ends at this line, Java Runtime frees all the memory and ends the execution of the program.
*/