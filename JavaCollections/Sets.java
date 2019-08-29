package JavaCollections;

import java.util.*;

// Unordered set of elements which doesn't allow us to
// store duplicate items. Set is implemented by 
// HashSet, LinkedHashSet, and TreeSet

// ** A LIST can contain duplicate elements, and a SET cannot, it contains unique elements only

public class Sets {

	public static void main(String[] args) {
		System.out.println("\n\n******** HashSet ********");

		Set<String> s1 = new HashSet<>(); // underlying data structure for HashSet is hashTable
		Set<String> s2 = new LinkedHashSet<>();
		Set<String> s3 = new TreeSet<>();

		s1.add("Lisa");
		s1.add("Nora");
		s1.add("Dan");
		s1.add("Jacob");
		s1.add("Lisa");

		Iterator itr = s1.iterator();

		// traversing set
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(s1); // another way of displaying hashSet

		System.out.println("s1 contains 'yilda'?: " + s1.contains("yilda"));

		// removing Lisa from set
		s1.remove("Lisa");
		System.out.println(s1);

		///////////////// LinkedHashSet //////////////////////////

		// LinkedHashSet maintains insertion order, and permits null elements

		System.out.println("\n\n******** LinkedHashSet ********");
		LinkedHashSet<String> set = new LinkedHashSet<>();

		set.add("Jenna");
		set.add("Mario");
		set.add("Kevin");
		set.add("Sarah");
		set.add(null);

		Iterator itr2 = set.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		set.add("Glenn");
		set.remove("Kevin");

		Iterator itr4 = set.iterator();

		System.out.println("\nPrinting set after removing Kevin and adding Glenn: ");
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}

		System.out.println("\n\n******** TreeSet ********");

		// TreeSet contains unique elements, sorted in ascending order
		TreeSet<String> tSet = new TreeSet<>();

		tSet.add("Jake");
		tSet.add("Brad");
		tSet.add("Austin");
		tSet.add("Blake");
		tSet.add("Aaron");

		Iterator itr5 = tSet.iterator();

		while (itr5.hasNext()) {
			System.out.println(itr5.next());
		}

	}

}
