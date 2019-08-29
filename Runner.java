

public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(5);
		list.insert(12);
		list.insert(21);
		list.insertAtStart(34);
		list.insertAt(0, 57);
		list.insert(0);
		list.deleteAtIndex(4);
		list.display();
		
		System.out.println();
		
		list.sort();
		
		list.display();
		
		System.out.println();
		
		System.out.println(list.pop());
		
		System.out.println("DOUBLY LINKED LIST");
		
		DoublyLinkedList dList = new DoublyLinkedList();
		
		dList.insert(67);
		dList.insert(45);
		dList.insert(78);
		dList.insert(96);
		
		dList.insertAtStart(12);
		dList.insertAtStart(77);
		
		dList.display();
		
		System.out.println();
		
		dList.displayBackwards();
		
		dList.remove(78);

	

		
		System.out.println();

		
		dList.display();
		
		dList.reverse();
		System.out.println();

		dList.display();



		
	}
}
