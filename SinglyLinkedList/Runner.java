package SinglyLinkedList;


public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(5);
		list.insert(12);
		list.insert(21);
	//	list.insertAtStart(34);
	//	list.insertAt(0, 57);
		list.insert(0);
		//list.deleteAtIndex(4);
	//	list.display();
		
		System.out.println();
		
	//	list.sort();
		
		list.display();
		
		System.out.println();
		
		//System.out.println(list.pop());
		
		System.out.println("count: " + list.count());
		
		System.out.println("Last node: " + list.lastNode());
		
	//	System.out.println("Is the linked list a loop?: " + list.isLoop());
	
		
		
	}
}
