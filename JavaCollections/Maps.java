package JavaCollections;
import java.util.*;

// A Map CANNOT contain duplicate keys, and each key can map to at most one value.
// HashMap and LinkedHashMap allow null key and null value but TreeMap does not.

// The order of a map depends on specific implementations, e.g. TreeMap and LinkedHashMap
// have predictable order, while HashMap does not.

// There are two interfaces for implementing Map in java: Map and SortedMap, and
// three classes: HashMap, TreeMap, and LinkedHashMap


/*
 
 Why and When to use Maps?
Maps are perfect to use for key-value association mapping such as dictionaries. 
The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys.
 Some examples are:

- A map of error codes and their descriptions.
- A map of zip codes and cities.
- A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages.
- A map of classes and students. Each class (key) is associated with a list of students (value).

Methods in Map Interface:

public Object put(Object key, Object value): This method is used to insert an entry in this map.
public void putAll(Map map): This method is used to insert the specified map in this map.
public Object remove(Object key): This method is used to delete an entry for the specified key.
public Object get(Object key):This method is used to return the value for the specified key.
public boolean containsKey(Object key): This method is used to search the specified key from this map.
public Set keySet(): This method is used to return the Set view containing all the keys.
public Set entrySet(): This method is used to return the Set view containing all the keys and values.
 
 */
public class Maps {

	public static void main(String[] args) {
		System.out.println("******** HashMap ********");
		// key type String, value type Integer
		Map<String, Integer> hm = new HashMap<>();
		
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		
		// remove element with key value 'b'
		hm.remove("b");
		
		Set<Map.Entry<String, Integer>> st = hm.entrySet();
		
		for (Map.Entry<String, Integer> me : st) {
			System.out.print(me.getKey()+ ": ");
			System.out.println(me.getValue());
		}
		
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		
		mapHttpErrors.put(200,  "OK");
		mapHttpErrors.put(303,  "See Other");
		mapHttpErrors.put(404,  "Not Found");
		mapHttpErrors.put(500,  "Internal Server Error");

		Set<Map.Entry<Integer, String>> s = mapHttpErrors.entrySet();
		
		for (Map.Entry<Integer, String> me : s) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		// New Map that copies elements from an existing map
		Map<Integer, String> mapErrors = new HashMap<>(mapHttpErrors);
		
		Set<Map.Entry<Integer, String>> setMap = mapErrors.entrySet();
		
		System.out.println();
		for (Map.Entry<Integer, String> me : setMap) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		
		Set<Integer> ks = mapErrors.keySet();
		
		for (Integer k : ks) {
			System.out.println("key: " + k);
		}

		
		
		System.out.println("Value at key '500': " + mapErrors.get(500));
		
		System.out.println("Does map contain key '800'?: " + mapErrors.containsKey(800));
		System.out.println("Does map contain key '303'?: " + mapErrors.containsKey(303));

		
		System.out.println("\n\n******** LinkedHashMap ********");

		// LinkedHashMap is just like HashMap with an additional feature of 
		// maintaining an order of elements inserted into it. 
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("one", "study java");
		lhm.put("two", "clean house");
		lhm.put("four", "wash clothes");
		
		// Prints the elements in the same order as they were inserted
		System.out.println(lhm);

		System.out.println("value for key 'one': " + lhm.get("one"));
		System.out.println("Size of the map: " + lhm.size());
		System.out.println("is map empty?: " + lhm.isEmpty());
		System.out.println("Contains key 'two'?: " + lhm.containsKey("seven"));
		System.out.println("Contains value 'clean house'?:" + lhm.containsValue("clean house"));
		System.out.println("Delete element 'one' " + lhm.remove("one"));
		
		System.out.println(lhm);
		

		Set<Map.Entry<String, String>> ch = lhm.entrySet();
		
		for (Map.Entry<String, String> me : ch) {
			System.out.println(me.getKey() + "-> " + me.getValue());
		}
		
		
		System.out.println("\n\n******** TreeMap ********");
		
		TreeMap<String, String> mapLang = new TreeMap<>();
		
		mapLang.put(".c",  "C");
		mapLang.put(".java", "Java");
		mapLang.put(".pl",  "Perl");
		mapLang.put(".php",  "PHP");
		mapLang.put(".cs",  "C#");
		mapLang.put(".cpp", "C++");

		// Hash Map sorts it's keys by alphabetical order
		System.out.println(mapLang);
		System.out.println("Size of map: " + mapLang.size());
		
		System.out.println("Removing key .php: " + mapLang.remove(".php"));
		System.out.println(mapLang);
		
		System.out.println("First (lowest) key currently in TreeMap: " + mapLang.firstKey());
		System.out.println("Last (highest) key currently in TreeMap: " + mapLang.lastKey());
		
		System.out.println("Map contains '.cs'?: " + mapLang.containsKey(".cs"));
		System.out.println("Map contains '.html'?: " + mapLang.containsKey(".html"));

		System.out.println("Map contains value: 'Perl'?: " + mapLang.containsValue("Perl"));
		System.out.println("Map contains value: 'Ruby'?: " + mapLang.containsValue("Ruby"));

		mapLang.put(".cs", "computer science");
		
		// if put is used on a key element that already existed, the 
		// value will get replaced with the new value
		System.out.println(mapLang);
		
		
	}
}
