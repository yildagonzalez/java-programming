import java.util.Arrays;
// Escaping characters
public class LessonThirteen {
	
	public static void main(String[] args) {
		
		String randomString = "I'm just a random string";
		
		String gotToQuote = "He said, \"I'm here\"";
		
		System.out.println(randomString + " " + gotToQuote);
		
		int numTwo = 2;
		
		System.out.println(randomString + " " + numTwo);
		
		String upperCaseStr = "BIG";
		String lowerCaseStr = "big";
		
		if(upperCaseStr.equalsIgnoreCase(lowerCaseStr)) {
			System.out.println("Thye're equal");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		System.out.println("2nd char: " + letters.charAt(1));
		
		// if letters comes before moreLetters, we get a negative number
		// if they're the same, we get 0
		// if letters comes after moreLetter, we get a positive number
		System.out.println(letters.compareTo(moreLetters)); 
		
		// to check if a strig contains certain things
		System.out.println(letters.contains("abc"));
		
		System.out.println(letters.endsWith("de"));
		
		System.out.println(letters.indexOf("cd"));
		
		// num of chars in string
		System.out.println("length: " + letters.length());
		
		// put string chars into array
		String[] letterArray = letters.split("");
		
		System.out.println(Arrays.toString(letterArray));
		
		char[] charArray = letters.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		// printing substrings
		System.out.println(letters.substring(1,4));
		
		System.out.println(letters.toUpperCase());
		
		// to delete all white space from string
		String randString = "         abdcefghijk     ";
		
		System.out.println(randString.trim());
		
		// stringBuilder changes every time a change is made to it, unlike
		// regular strings which only produce a mutated copy each time
		StringBuilder randSB = new StringBuilder("A random value");
		
		System.out.println(randSB.append(" again"));
		
		System.out.println(randSB);
		
		System.out.println(randSB.delete(15,21));
		
		// how many chars are being allocated for string
		System.out.println(randSB.capacity());
		
		// change capacity of string to at least some value, could be bigger
		randSB.ensureCapacity(60);
		
		System.out.println(randSB.capacity());
		
		System.out.println(randSB.length()); // num of chars in string
		
		// trim size of capacity to size of string
		randSB.trimToSize();
		
		System.out.println(randSB.capacity());
		
		// insert a certain string starting at certain index
		System.out.println(randSB.insert(1, "nother"));
		
		
		// convert string builder to string
		String oldSB = randSB.toString();
		
		// strignBuilders have same methods as strings such as:
		// charAt()
		// indexOf()
		// lastIndexOf()
		// subString()

		
		
		
		
		
		
		
		
		
		
		
	}
}
