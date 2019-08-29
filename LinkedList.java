
public class LinkedList {

	Node head;
	
	public void insert(int data) {
		
		// first create a node
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		// list is empty, no nodes yet; make the first node the head
		if(head == null) {
			
			head = node;
		}
		else {
			// need to traverse through list to insert at the end of list
			// we know we're at the end when next == null
			Node n = head;
			
			while (n.next != null) {
				n = n.next;
			}
			n.next = node; // once we see the null, we replace it with the new node we created
			
		}
		
		
	} // END OF INSERT
	
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		node.next = head; // adding the current head to second position
		head = node;
		
		
	} // END OF insertAtStart
	
	public void insertAt(int index, int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head; // to traverse the list
		
		if (index == 0) {
			
			insertAtStart(data);
			return; // to exit out of this method
		}
		// we need to stop traversing in index-1
		for (int i = 0; i < index - 1; i++) {
			
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		
	} // END OF insertAt
	
	
	public int pop() {
		// pop and return the head
		Node n = head;
		head = n.next;	
		return n.data;	
		
	}
	
	public void deleteAtIndex(int index) {
		
		Node n = head;
		
		if (index == 0) {
			head = n.next;
			return;
		}
	
		for(int i = 0; i < index - 1; i++) {
			
			n = n.next;
		}
		n.next = n.next.next;
		
	} // END OF deleteAtIndex
	
	public void sort() {
		
		Node min = head;
		Node tmp = min.next;
		
		while (min != null) { 
			while(tmp != null) {
				if(min.data > tmp.data) {
					
					swap(min, tmp);
			
				}
				
				tmp = tmp.next;
			}
			
			min = min.next;
			tmp = min;
			
		}
		
	} // END OF sort
	
	public void swap(Node a, Node b) {
		int tmpData = a.data;
		a.data = b.data;
		b.data = tmpData;
	} // END OF swap
	
	public void display() {
		
		Node node = head;
		
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
		
	} // END OF display
	
	
	
	
	
	
	
	
	
	
}
