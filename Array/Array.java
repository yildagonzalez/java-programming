package Array;
 
/* An array is a group of like-typed variables that are referred to by a 
   common name. Arrays in Java work differently than they do in C/C++.
   
   - In Java all arrays are dynamically allocated
   - Since arrays are objects in Java, we can find their length using member
   	 length. This is different from C/C++ where we find the length using sizeof.
   - A java array variable can also be declared like other variables with [] after the data type.
   - The variables in the array are ordered and each have an index starting from 0.
   - An array can also be used as a static field, a local variable or method parameter
   - the size of an array must be specified by an int value and not long or short
   - the direct superclass of an array type is object
   - every array type implements the interfaces cloneable and java.io.Serializable
   
    Array can contain primitive data types, as well as objects of a class  depending on the definition of array.
    In case of primitive data types, the actual values are stored in contiguous memory locations.
    In case of objects of a class, the actual objects are stored in heap segment.
    
    
*/

public class Array {
	
	// declaring new array of size 5
	int numArray[] = new int[100];
	
	
	// declaring array of strings
	String[] names = new String[] {"John", "Katie", "Ben"};	
	
	public void populate() {
		
		for (int i = 0; i < 100; i++) {
			numArray[i] = i+1;
		}
	}
	
	
	public void print() {
		
		for (int n : numArray) {
			System.out.println(n);
		}
	}
	
	public void sort(int[] arr, int n) {
		
		for (int i = 0; i < n; i++) {
			
			arr[i] = i+1;
		}
		
	}
	
	
}
