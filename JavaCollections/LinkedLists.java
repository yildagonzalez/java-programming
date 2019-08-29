package JavaCollections;
import java.util.*;
import java.util.LinkedList;

public class LinkedLists {
	
	public static void main(String[] args) {
		
		// LinkedList that only stores strings
		LinkedList<String> names = new LinkedList<String>();
		
		// non-restricted linkedList, can add objects of different types
		LinkedList numbers = new LinkedList(); 
		
		// adding several names to linkedlist
		names.add("Yilda");
		names.add("Irving");
		names.add("John");
		names.add(1, "Kate");
		
		for (String n : names) {
			System.out.print(n + ", ");
		}
		
		LinkedList<String> students = new LinkedList<>();
		
		students.add("Glenda");
		
		// Append all of the elements in LinkedList names to end of students LinkedList
		students.addAll(names);
		
		
		System.out.println("\n\nAppending all of names to end of students: ");
		for (String n : students) {
			System.out.print(n + ", ");
		}
		
		List<String> friends = new LinkedList<String>();
		
		friends.add("Mary");
		friends.add("Paul");
		
		// Append all the elements in names list, starting at index 2 of friends
		friends.addAll(2, names);
		System.out.println("\nFriends list:");
		for (String n : friends) {
			System.out.print(n + ", ");
		}
		
		names.addFirst("Kendra");
		names.addLast("Bob");
		
		System.out.println("\nAdding 'Kendra' to front of list and 'Bob' to end of list:");
		for (String n : names) {
			System.out.print(n + ", ");
		}
		
		friends.clear();
		System.out.println("\nIs friends list empty?: " + friends.isEmpty());
		
		System.out.println("\nIs names list empty?: " + names.isEmpty());

		List<String> namesCopy = new LinkedList<>();
		
		namesCopy = (LinkedList) names.clone();
		
		System.out.println("\ncloning 'names' LinkedList to 'namesCopy':");
		for (String n : namesCopy) {
			System.out.println(n);
		}
		
		String name = "Lola";
		if (names.contains(name)) {
			System.out.println(name  + " is present in names");
		}
		else {
			System.out.println(name + " is not present in names");
		}
		
		System.out.println();
		LinkedList<String> test = new LinkedList<String>();
		test.add("David");
		
		if(!test.isEmpty())
		{
			System.out.println("First element in test: " + test.element());
			System.out.println("Last element in test: " + test.getLast());
		}
			
		else 
		{
			System.out.println("test linkedlist is empty");

		}
		
		test.clear();
		
		System.out.println("First element of test, or null if empty: " + test.peekFirst());
		System.out.println("Last element of test, or null if empty: " + test.peekLast());
		
		
		Iterator itr = names.descendingIterator();
		 // Printing names list in reverse order
		System.out.println("Printing names list in reverse order");
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		
		
		System.out.println("\nBob is at index: " + names.indexOf("Bob"));
		
		System.out.println(names);
		
		System.out.println("Josh is at index: or returns -1 if not in list: " +names.indexOf("josh"));
		
		ListIterator listItr = names.listIterator(3);
		
		System.out.println("Printing names list starting at index 3 using iterator: ");
		while (listItr.hasNext()) {
			System.out.print(listItr.next() + ", ");
		}
		
		
		System.out.println("\n" + names.pollFirst());
		System.out.println(names.pollLast());
		System.out.println(names);
		
		
		Object nameArray[] = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println("nameArray: " + Arrays.toString(nameArray));
		
		// Add to front of list
		names.push("Lina");
		names.push("Valentina");
		
		System.out.println(names);
		
		System.out.println("*Popping first element of names*");
		System.out.println(names.pop());
		
		System.out.println("names list after popping last element");
		System.out.println(names);
		 
		// removes and returns last element of list
		System.out.println("removes last element of name list: " + names.removeLast());
	
		System.out.println(names);
		
		// LinkedList of books
		LinkedList<Book> booksList = new LinkedList<>();
		
		booksList.add(new Book(101, "Dance in the Rain", "Kendra Scott", "BPB", 5));
		booksList.add(new Book(102, "The Fault in our Stars", "Shandra Rahn", "CPB", 8));
		booksList.add(new Book(103, "The Girl in the Spiderweb", "Mark Brown", "ZZT", 10));
		
		for (Book b : booksList) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		
	

		
		
	}

	
	
}
