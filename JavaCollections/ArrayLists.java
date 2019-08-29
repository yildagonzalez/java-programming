package JavaCollections;
import java.util.*;

// Testing collection Lists, specifically ArrayList

public class ArrayLists {
	
	// Method that merges two string arrays into an arrayList
	static ArrayList<String> merge (String[] words, String[] more) {
		
		ArrayList<String> sentence = new ArrayList<>();
		for (String w : words) sentence.add(w);
		for (String w : more) sentence.add(w);
		return sentence;
	}
	
	public static void main(String[] args) {
		
		// Two different ways of declaring an arrayList

		List<String> list1 = new ArrayList<String>();
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list1.add("Yilda"); // Add "Yilda" to end of list
		list1.add("Irving");
		list1.add(0, "Kyle"); // add "Kyle" to index 0
		
		Iterator itr = list1.iterator(); // iterator to iterate through list
		
		System.out.println("List1:");
		while (itr.hasNext()) { // returns true if more items on list
			System.out.println(itr.next()); // prints next element on list
		}
		
	
		
		
		List<String> list3 = new ArrayList<>(); // different way of declaring arrayList
		
		list3.addAll(list1); // Adds all elements in list1 to list3
		
		Iterator itr1 = list3.iterator();
		
		System.out.println("\nList3: ");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		list3.clear();
		
		if (list3.isEmpty()) {
			System.out.println("\nList3 is empty");
		}
		
		if (list1.isEmpty()) {
			System.out.println("\nList1 is empty");
		}
		else {
			System.out.println("List1 is NOT empty");
		}
		
		
		list1.add("Kyle");
		list1.add("John");
		
		System.out.println(list1.lastIndexOf("Kyle")); // returns last index of where "Kyle" was added
		
		System.out.println("\nPrinting list1 again: ");
		itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nIndex of Yilda: " + list1.indexOf("Yilda"));
		
		System.out.println("Does list contain 'Erik'?: " + list1.contains("Erik"));
		
		System.out.println("Does list contain 'Irving'?: " + list1.contains("Irving"));

		System.out.println("Hash code for list1: " + list1.hashCode());
		
		System.out.println("Element at position 3 of list1: " + list1.get(3));
		
		List<String> list4 = new ArrayList<>();
		
		list4.addAll(list1);
		
		System.out.println("Does list4 == list1?: " + list4.equals(list1));
		System.out.println("Does list3 == list1?: " + list3.equals(list1));
		
		System.out.println("Size of list1: " + list1.size());
		
		System.out.println("list from index 2 to 4: " + list1.subList(2, 4));
		
		// replaces the specified element in the list, present at specified position
		list1.set(0, "Jackson");
		
		System.out.println("\nList1: " + list1);
		
		//list1.removeAll(list1); // removes all elements from the list
		
	
		//System.out.println(list1.isEmpty());
		
		List<String> sample = new ArrayList<>();
		
		sample.add("Glenda");
		sample.add("Bob");
		sample.add("Yilda");
		System.out.println("List before retainAll: " + sample);
		sample.retainAll(list1); // retains the same elements in the list as the passed list ex. if both lists have the element "Yilda", it retains that element
		System.out.println("\nList after retainAll: " + sample);
		
		String s = "Yilda is so cool";
		String replacedString = s.replaceAll("i", "*");
		
		System.out.println(replacedString);
		
		
		Iterator itr4 = list1.iterator();
		
		List<String> modifiedNames = new ArrayList<>();
		
		while (itr4.hasNext()) {
			String newString = (String) itr4.next();
			modifiedNames.add(newString.replaceAll("a", "*"));
			System.out.println("old string: " + newString + " new string: " + newString.replaceAll("a", "*"));
		}
		
		System.out.println(list1); // list1 is not directly modified
		
		System.out.println("modified names list: " + modifiedNames);
		
		String stringWithSpaces = "Hello     world    this   is my new album bops and mixes idk ";
		
		String stringWithNoSpaces = stringWithSpaces.replaceAll("\\s", "");
		
		String comas = "this, my friends, is a string, with, a lot, of comas";
		
		String dashes = comas.replaceAll(",", "-");
		System.out.println(stringWithNoSpaces);
		System.out.println(dashes);
		

		Collections.sort(list1); // sorts the list
		
		System.out.println("Sorted list in ascending order: " + list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("Sorted list in descending order: " + list1);
	
		
		// using for loop to get all elements in the list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + ": " + list1.get(i));
		}
		
		Object a[] = list1.toArray(); // returns an array containing all of the elements in list1 in the correct order

		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		List<String> list5 = new ArrayList<>();
		
		list5.addAll(list1);
		
		System.out.println("list1: " + list1);
		System.out.println("list3: " + list3);
		System.out.println("list5: " + list5);
		System.out.println("Does list3 contains all elemets of list5" + list3.containsAll(list1));
		
		System.out.println("Does list5 contain all elements of list1?: " + list5.containsAll(list1));
		
		String[] words = {"This", "is","the", "first", "sentence"};
		String[] more = {"Here", "is", "the", "second", "sentence"};
		
		System.out.println(merge(words, more));
		
		
		
		
	}
	
}
