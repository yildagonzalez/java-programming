import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Enumeration;

// collection classes let us keep track of groups of objects
// Arraylist automatically resize when we delete or add items to them as opposed to regular arrays
public class LessonEleven {
	public static void main(String[] args) {
		
		 // new vector object
		Vector<String> v = new Vector<String>();
		v.addElement("Practice");
		v.addElement("quiz");
		v.addElement("code");
		
		System.out.println("Vector elements are: ");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println("element: " + e.nextElement());
		}
		
		
		ArrayList arrayListOne; // creating ArrayList variable
		
		arrayListOne = new ArrayList(); // create and ArrayList object, we don't have to set a size because it automatically does it
		
		ArrayList arrayListTwo = new ArrayList(); // we can define everything on one line
		
		// ArrayList can accept any type of object, but we can set it to accept only strings by doing this:
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("John Smith");
		names.add("karen Miller");
		names.add("Oliver Jenkins");
		
		names.add(2, "Jack Ryan"); // index which you want to put into
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println('\n');
		
		// to replace a value inside an ArrayList
		names.set(2, "John Adams");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println('\n');
		
		// remove items
		names.remove(3);
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println('\n');

		System.out.println(names);
		System.out.println('\n');
		
		System.out.println("Printing with enhanced for loop");
		// enhanced for loop
		for(String row : names ) {
			System.out.println(row);
		}
		System.out.println("\n");
		
		
		Iterator indivItems = names.iterator();
		
		while(indivItems.hasNext()) {
			
			System.out.println("name: " + indivItems.next());
		}

		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		// copy on array elements to another
		nameCopy.addAll(names);
		
		String paulYoung = "Paul Young";
		
		names.add(paulYoung);
		
		// check if string is inside array
		if (names.contains(paulYoung)) {
			System.out.println("Paul is here");
		}
		
		
		// check if one array is a subset of another
		if (names.containsAll(nameCopy)) {
			System.out.println("Everything in nameCopy is in names");
		}
		
		// delete everything inside an ArrayList
		names.clear();
		
		// to check if ArrayList is empty
		if(names.isEmpty()) {
			System.out.println("ArrayList is empty");
		}
		
		// How to turn an ArrayList into a regular array full of objects
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
