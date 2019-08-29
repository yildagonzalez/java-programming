
public class DoublyLinkedList {
	
	Node head;
	Node tail;
	
	// constructor
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	public void insert(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		// empty list
		if (head == null && tail == null) {
			
			head = node;
			tail = node;
			node.prev = null;
		}
		else {
			
			tail.next = node;
			node.prev = tail;
			tail = node;
			tail.next = null;
		}
		
		
	} // END OF insert
	
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.data = data;
		node.prev = null;
		
		if (head == null && tail == null) {
			
			head = node;
			tail = node;
			node.next = null;
		}
		else {
			head.prev = node;
			node.next = head;
			head = node;
		}
		
	} // END OF insertAtStart
	
	public void swap(Node a, Node b) {
		int tmpData = a.data;
		a.data = b.data;
		b.data = tmpData;
	} // END OF swap
	
	public void reverse(Node a, Node b) {
		
		if (head == null) {}
		
		else if (head == tail) {}
		
		else if (a.next == b) {
			swap(a, b);
		}
		
		else if (a == b) {}
		
		else {
			swap(a, b);
			reverse(a.next, b.prev);
		}
	}
	
	public void reverse() {
		Node start = head;
		Node end = tail;
		reverse(start, end);
	}
	
	void remove(int data) {
		
		Node n = head;
		remove(n, data);
	} // END OF remove
	
	public void remove(Node p, int data) {
	
		if (head == null) {} // list is empty, do nothing
		
		// one element
		else if (head == tail) {
			
			head = null;
			tail = null;
		}
		
		else if (head.data == data) {
			
			head = head.next;
			head.prev = null;
		}
		
		else if (tail.data == data) {
			
			tail = tail.prev;
			tail.next = null;
		}
		
		else if (p.data == data) {
			
			Node before = p.prev;
			Node after = p.next;
			before.next = after;
			after.prev = before;
			
		}
		
		else {
			
			remove(p.next, data);
		}
		
	} // END OF remove
	
	
	public void displayFront(Node n) {
		
		if (n == null) {}
		else {
			
			System.out.print(n.data + ", ");
			displayFront(n.next);
			
		}
		
	} // END OF displayFront
	
	public void displayBack(Node n) {
		
		if (n == null) {}
		else {
			displayBack(n.next);
			System.out.print(n.data + ", ");
		}
	}
	
	public void display() {
		
		Node h = head;
		displayFront(h);
		
	} // END OF display
	
	public void displayBackwards() {
		
		Node h = head;
		displayBack(h);
		
	} // END OF displayBackwards
	
	
}


