 package Queue;

public class Queue {
	
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enqueue(int data) {
		
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size++;
		}
		else {
			System.out.println("Queue is full");
		}
	
		
	} // END OF enqueue
	
	public int dequeue() {
		
		int data = queue[front]; //queue[0]
		
		if(!isEmpty()) {
			front = (front + 1) % 5; // setting new front
			size--; // decrease size of queue
		}
		else {
			System.out.println("Queue is empty");
		}
		
		
		return data;
	} // END OF dequeue
	
	public int size() {
		return size;
	} // END OF size
	
	public boolean isEmpty() {
		return size == 0;
	} // END OF size
	
	public boolean isFull() {
		return size == 5;
	} // END OF isFull

	public void display() {
		
		System.out.println("Elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front+i) % 5] + " "); // to start dequeuing from front element 
		}
		
		System.out.println();
		
		for (int n : queue) {
			System.out.println("element " + n + " ");
		}
	} // END OF display
	
	
	
	
	
	
	
}
