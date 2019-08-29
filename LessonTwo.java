public class LessonTwo {
	public static void main (String[] args) {
		
		int randomNumber = (int) (Math.random() * 50 );
		
		if (randomNumber < 25) {
			System.out.println("number is less than 25");
			System.out.println("the number is: " + randomNumber);
		}
		else if (randomNumber > 40) {
			System.out.println("number is greater than 40");
			System.out.println("the number is: " + randomNumber);
		}
		else if (randomNumber != 40) {
			System.out.println("the number is NOT equal to 40");
		}
		else {
			System.out.println("Nothing worked, The number is: " + randomNumber);
		}
		
		
		if(!(false)) {
			System.out.println("\nI turned false into true");
		}
		if((false) || (true)) {
			System.out.println("true or false");
		}
		// XOR - prints if one is true and one is false
		if(false ^ true) {
			System.out.println("one is true");
		}
		
		
		int valueOne = 1;
		int valueTwo = 2;
		
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		
		System.out.println("biggest value: " + biggestValue);
		
		// SWITCH STATEMENT
		
		char theGrade = 'g';
		
		switch (theGrade) {
		case 'A':
			System.out.println("Great job");
			break;
		case 'B': 
			System.out.println("Good job");
			break;
		case 'C':
			System.out.println("Ok");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("Fail");
			break;
		
		}
	}
}