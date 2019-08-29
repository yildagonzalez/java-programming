package Queue;

public class Runner {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		System.out.println("empty: " + q.isEmpty());
		
		q.enqueue(5);
		q.enqueue(2);
		q.enqueue(7);
		q.enqueue(3);
	
		
		System.out.println("full: " + q.isFull());

		//q.dequeue();
		//q.dequeue(); 
		
		System.out.println("full: " + q.isFull());
		
		q.enqueue(9);
		//q.enqueue(1);
		
		//q.enqueue(19);
		//q.enqueue(15);
		
		//System.out.println("size: " + q.size());
		//System.out.println("empty: " + q.isEmpty());
		
		q.dequeue(); 
		q.dequeue(); 
		q.dequeue(); 
		q.dequeue(); 
		q.dequeue(); 
		
		System.out.println("front: " + q.front + " rear: " + q.rear);
		q.display();
		
		
	}
}
