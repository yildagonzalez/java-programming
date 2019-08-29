// Linked Lists
import java.util.Arrays;
import java.util.LinkedList;

public class LessonTwelve {
	
	public static void main(String[] args) {
		
		// creating a new linked list
		LinkedList linkedListOne = new LinkedList();
		
		// restricted linked list that only stores strings
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Yilda Gonzalez");
		names.add("Trevor Morgan");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println('\n');
		
		// add to end of list
		names.addLast("Nathan Garza");
		
		// add to beginning of list
		names.addFirst("Kayla Jones");
		
		names.add(0, "Noah Peters");
		
		// replace a value
		names.set(2,  "Paul Newman");
		
		// remove 
		names.remove(4);
		names.remove("Kayla Jones");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println('\n');
		
		
		// get certain element by index
		
		System.out.println("\nFirst Index: " + names.get(0));
		System.out.println("\nLast Index: " + names.getLast());
		
		// create a new linked list and give it all the value of another linked list
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		
		System.out.println("\nnameCopy: " + nameCopy);
		
		if(names.contains("Noah Peters")) {
			System.out.println("\nNoah's here");
		}
		
		// check if names contains all the same names as nameCopy
		if(names.containsAll(nameCopy)) {
			System.out.println("\nCollections the same");
		}
		
		System.out.println("\nTrevor Morgan index: " + names.indexOf("Trevor Morgan"));
		
		System.out.println("\nFirst index: " + names.get(0));
		
		System.out.println("\nList Empty: " + names.isEmpty());
		
		System.out.println("\nHow Many: " + names.size());
		
		// check if there's a first element
		System.out.println("\nLook without Error: " + names.peek());
		
		System.out.println("\nRemove first element: " + nameCopy.poll());
		
		System.out.println("\nRemove last element: " + nameCopy.pollLast());
		
		System.out.println("\n " + nameCopy.toString());
		
		nameCopy.push("Noah Peters"); // add to front of linked list
		nameCopy.pop(); // pops first element
		
		for(String name : nameCopy) {
			System.out.println(name);
		}
		
		// create an array
		
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println(Arrays.toString(nameArray));

		// delete everything in linked list
		names.clear();
		
		System.out.println(names.toString());
		
		
	}
}
