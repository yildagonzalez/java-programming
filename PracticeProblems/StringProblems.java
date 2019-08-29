package PracticeProblems;
import java.util.*;

public class StringProblems {

	// create a program to count the
	// number of occurrence of a word
	// in the given string given a string
	static int countOccurrences(String str, String word, char separator) {

		// convert char to string
		String s = Character.toString(separator);
		// create an array made up of words from string
		String a[] = str.split(s);

		int count = 0;

		for (String n : a) {

			if(n.equals(word)) {

				count++;
			}
		}

		return count;
	}
	


	// Given a string, convert the string to integer
	static int stringtoInt(String s) {

		// can also use .valueOf(s),
		// only works for s = some string of ints
		return Integer.parseInt(s);
	}

	// Write a function to check whether two strings are an anagram of each other
	// using hashMap, e.g. "adcd" and "cbad" are an anagram of each other

	// We find if two strings are anagrams of each other by mapping the
	// characters of each string to individual hashmaps and comparing
	// them together
	static boolean areAnagram(String s1, String s2) {

		// create two HashMap and compare them to each other

		HashMap<Character, Integer> hmap1 = new HashMap<>();
		HashMap<Character, Integer> hmap2 = new HashMap<>();

		// get individual chars from strings by converting them to arrays
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		// HashMap for string1
		// put char arrays into HashMap, key is char, value is # times in string
		for (int i = 0; i < arr1.length; i++) {
			// check if there is something in location already
			// if there's not, add char as key and 1 as first seen frequency
			if (hmap1.get(arr1[i]) == null) {
				hmap1.put(arr1[i], 1);
			}
			else {
				// letter already in HashMap, increment value by
				// overriding put method, get previous value and increment by 1
				int newValue = hmap1.get(arr1[i]) + 1; // returns value of key arr1[i]
				hmap1.put(arr1[i], newValue);
			}
		}

		// HashMap for string2
		// put char arrays into HashMap, key is char, value is # times in string
		for (int j = 0; j < arr2.length; j++) {
			// check if there is something in location already
			// if there's not, add char as key and 1 as first seen frequency
			if (hmap2.get(arr2[j]) == null) {
				hmap2.put(arr2[j], 1);
			}
			else {
				// letter already in HashMap, increment value by
				// overriding put method, get previous value and increment by 1
				int newValue = hmap2.get(arr2[j]) + 1; // returns value of key arr1[i]
				hmap2.put(arr2[j], newValue);
			}
		}

		// comparing HashMaps

		if (hmap1.equals(hmap2)) 
			return true;
		else
			return false;
	}
	
	// Reverse string using string buffer
	static String reverseString(String s) {
		
		StringBuffer sbf = new StringBuffer(s);
		System.out.println("String buffer: " + sbf);
		
		// here it reverses the string buffer
		String reversedString = new String(sbf.reverse());
		System.out.println("The string buffer after reversing: " + sbf);
	
		return sbf.toString();
	}
	
	// Reverse using iteration
	public static String reverse(String str) {
		
		StringBuilder strBuilder = new StringBuilder();
		
		char[] strChars = str.toCharArray();
		
		for (int i = strChars.length - 1; i >= 0; i--) {
			strBuilder.append(strChars[i]);
		}
		
		return strBuilder.toString();
	}
	
	
	// reverse string recursively
	public static String reverseRecursively(String str) {
		
		if (str.isEmpty()) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}
	
	
	// Stringbuilder
	public static String joinWords(String[] words) {
		
		StringBuilder sb = new StringBuilder();
		for (String w : words) {
			sb.append(w);
		}
		return sb.toString();
	}

	// reverse a string with string builder
	public static String reverseWithStringBuilder(String str) {
		StringBuilder sb = new StringBuilder();
		char[] strArray = str.toCharArray();
		for (char c : strArray) sb.append(c);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {

	/*	System.out.println(countOccurrences("hello-foo-mom-sun,", "hello", '-'));

		System.out.println();

		System.out.println(countOccurrences("hello,foo,hello,mom,beer,beer", "beer", ','));
		*/

		System.out.println(stringtoInt("900"));

		char[] ch = {'y', 'i', 'l', 'd', 'a'};

		for (char c : ch) {
			System.out.print(c + " ");
		}

		// creating new string of char array ch
		String name = new String(ch);

		System.out.println("\nString created: " + name);

		// concat() method concatenates one string to the end of another string
		// this method returns a string with the value of the string passed into the 
		// method, appended to the end of the string

		String colors= "blue";
		colors = colors.concat(" red");
		System.out.println(colors);

		// + operator to concatenate string on either side
		String s1 = "Yilda";
		String s2 = " is kinda cool";
		int age = 23;
		String s4 = " is the age of ";
		String s3 = s1 + s2;
		String s5 = s1 + s4 + age;

		System.out.println(s3);
		System.out.println(s5);

		String a = "listen";
		String b = "silent";

		System.out.println(a + " + " + b + " are anagrams?: " + areAnagram(a, b));



		System.out.println(reverseString("Yilda"));
		
		System.out.println(reverse("john"));
		
		System.out.println(reverseRecursively("flower"));
		
		
		String[] words = {"I", "will", "join", "all", "these", "words"};
		
		System.out.println(joinWords(words));

		System.out.println(reverseWithStringBuilder("Hello World"));
		
		











	}


}
