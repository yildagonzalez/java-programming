package DoublyLinkedList;

public class Runner {

	public static void main(String[] args) {
		
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
