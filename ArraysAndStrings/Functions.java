package ArraysAndStrings;
import java.util.Arrays;


public class Functions {

	
	// Implement an algorithm to determine if a string has all 
		// unique characters. What if you cannot use additional data structures?
		// O(n)
		public boolean isUnique(String str) {
			
			if (str.length() > 256) {
				return false; // max 256 chars in ASCII alphabet
			}
			
			boolean[] char_set = new boolean[128];
			
			for (int i = 0; i < str.length(); i++) {
				
				int val = str.charAt(i);
				System.out.println("character " + str.charAt(i) + " at index " + val );
				if (char_set[val]) {
					return false;
				}
				else {
					char_set[val] = true;
				}
			}
			
			return true;
		} // END OF isUnique
		
		
		// Check permutation
		// Given two strings, write a method to decide if one 
		// is a permutation of the other
		
		public String sort(String s) {
			
			char[] content = s.toCharArray();
			
			java.util.Arrays.sort(content);
			
			String newString = new String(content);
			System.out.println("converted " + s + " back to string: " + newString);
			return newString;
			
		} // END OF sort
		
		public boolean permutation(String s, String t) {
			
			if(s.length() != t.length()) {
				return false;
			}
			
			return sort(s).equals(sort(t));
					
		} // END OF permutation
		
		
		 // Function to check the Vowel 
		public int isVowel(char ch) 
	    { 
	        ch = Character.toUpperCase(ch); 
	       if(ch=='A' || ch=='E' || ch=='I' || 
	            ch=='O' || ch=='U')  
	           return 1; 
	       else return 0; 
	    } 
	       
	    // to count total number of vowel from 0 to n 
	    public int countVowels(String str, int n) 
	    { 
	    	if (n == 1) {
	    		return isVowel(str.charAt(n - 1)); 

	    	}
	    	else {
	    		// isVowel will return one or zero, which gets added here every time a vowel is found
	    		return countVowels(str, n-1) + isVowel(str.charAt(n - 1)); 

	    	}
	    } 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
