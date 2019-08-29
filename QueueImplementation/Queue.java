package QueueImplementation;
	
// Queue implementation using linked list

public class Queue {
	
	Node first, last;
	
	public void enqueue(int data) {
		Node n = new Node(data);
		
		// empty queue
		if (first == null) {
			first = last = n;
		}
		else {
			last.next = n;
			last = n;
		}	
	}
	
	public int dequeue() {
		if (first == null) {
			return -1;
		}
		else {
			int temp = first.val;
			first = first.next;
			return temp;
		}
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		q.enqueue(6);
		q.enqueue(5);
		q.enqueue(9);
		
		while (!q.isEmpty()) {
			System.out.println("Dequeuing: " + q.dequeue());
		}
		
		System.out.println("Empty? " + q.isEmpty());
		
		
	}
	
	
	
}
