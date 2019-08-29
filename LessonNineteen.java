// Regular Expressions
import java.util.regex.*;

public class LessonNineteen {

	public static void main(String[] args) {

		String longString = " Derek Banas CA AK 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		
		// Regex allows us to look for certain characters in an expression
		
		// [0-9], [A-Z] - Any characters you want
		// [^A-G] - characters NOT A-G
		// \\s - whitespace
		// \\S - NOT whitespace
		
		// looking for word that is 2-20 chars in length
		// [A-Za-z]{2,20} \\w{2,20
		
		
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		System.out.println();
		
		// looking for a zip code, 5 digits long
		regexChecker("\\s\\d{5}\\s", longString);
		
		// two characters that start with a C or A
		//A[KLRZ]|C[AOT]
		regexChecker("A[KLRZ]|C[AOT]", longString);
		
		//{n,} minimun chars but no maximum
		// + - whatever proceeds must occur one or more times
		// . ^ * + ? {} [ ] \ | () - these need to be backslashed
		
		regexChecker("(\\({1,})", strangeString);



	}
	
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()) {
			if(regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());

		}
	}
	
	
	
	
	
	
	
	
}
