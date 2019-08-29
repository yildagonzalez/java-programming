// Exception handling
// java.lang.RunTimeException
// java.lang.Exception
// ArithmeticException
// ClassNotFoundException
// IllegalArgumentException
// IndexOutOfBoundsException
// InputMismatchException
// IOException
import java.util.*;
import java.io.*;
public class LessonFive {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*System.out.print("How old are you?: ");
		int age = checkValidAge();
		
		if (age != 0) {
			System.out.println("You are " + age + " years old");
		}
		*/
		// working with files
		getAFile("./someStuff.txt");
	}
	
	
	public static int checkValidAge() {
		 try {
			 return in.nextInt();
		 }
		 catch (InputMismatchException e) {
			 in.next(); // flush the previous user input, disregard previous input
			 System.out.println("That isn't a whole number");
			 return 0;
		 }
	}
	
	
	public static void divideByZero(int a) {
		try {
			
			System.out.println(a/0);
		}
		catch (ArithmeticException e) {
			System.out.println("You can't do that");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void getAFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
		}
		catch(FileNotFoundException e) {
			System.out.println("Sorry, cannot find that file");
		}
		catch(IOException e) {
			System.out.println("Unknown IO Error");
		}
		//catch(ClassNotFoundException | IOException e) {} // to ignore exceptions
		catch(Exception e){
			System.out.println("Some error occurred");
		}
		// this will run no matter what, weather an exception was called or not
		// you can also use this to close databases connections or closing files.
		finally {
			System.out.println("");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}