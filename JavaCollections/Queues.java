package JavaCollections;
import java.util.*;

public class Queues {

	public static void main(String[] args) {
	
		Queue<Integer> q = new PriorityQueue();
		
		q.add(4);
		q.add(1);
		q.add(5);
		q.add(2);
		
		// Retrieves head of queue, throws null exception when queue is empty
		System.out.println("Head: " + q.element());
		
		System.out.println("Head using peek: " + q.peek());

		Iterator itr = q.iterator();
		
		// printing out all elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Removing the top priority element or the head 
		// and printing the modified pQueue using poll()
		//q.poll();
		//System.out.println("After removing an element with poll function");
		
		Iterator itr2 = q.iterator();
		
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("queue contains 9?: " + q.contains(9));
		
		
		while (!q.isEmpty()) {
			System.out.println("removing: " + q.poll());
		}
		
		System.out.println(q);
		
		
		
		
		
		
	}
}
