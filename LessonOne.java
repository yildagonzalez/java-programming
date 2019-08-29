import java.util.Scanner;

public class LessonOne {
	
	// static means the variable or method marked as such is available at the
	// class level. In other words, you don't need to create an instance of the
	// class to access it.
	/*
	 	So, instead of creating an instance of Foo and then calling doStuff like this:
	 		*****************
	 		Foo f = new Foo;
	 		f.doStuff();
	 		*****************
	 		
	 	You just call the method directly against the class, like so:
	 		***************
	 		Foo.doStuff();
	 		***************
	 
	 */
	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("Enter your favorite number: ");
		
		// is the next thing typed into keyboard an int? then do this..
		if (userInput.hasNextInt()) {
			
			// getting user input, if entered thing is not 
			// a number, program will crash
			int numberEntered = userInput.nextInt();
			System.out.println("you entered " + numberEntered);
			
			int numberEnteredTimes2 = numberEntered + numberEntered;
			System.out.println("numberEntered + numberEntered = " + numberEnteredTimes2 );
		
			int moduloNumber = numberEntered % 2;
			System.out.println(numberEntered  + " % 2 = " + moduloNumber);
			
			int numberABS = Math.abs(-5);
			int whichIsBigger = Math.max(5, 7);
			int whichIsSmaller = Math.min(5, 7);
			
			double numSqrt = Math.sqrt(25);
			
			int numCeiling = (int) Math.ceil(5.23);
			int numFloor = (int) Math.floor(5.23);
			
			int numRound = (int) Math.round(5.63);
			
			int randomNumber = (int) (Math.random() * 11);
			
			System.out.println("Random Number: " + randomNumber);
			
		}
		else {
			System.out.println("Enter an integer next time!");
		}
	}
}