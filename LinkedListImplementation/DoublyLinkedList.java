package LinkedListImplementation;
import java.util.*;

public class DoublyLinkedList {

	Node head;
	Node tail;
	
	public DoublyLinkedList() {
		head = tail = null;
	}
	
	public void insert(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		// check if list is empty
		if (head ==  null && tail == null) {
			node.prev = null;
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
			tail.next = null;
		}
		
	}
	
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.data = data;
		node.prev = null;
		
		// empty list case
		if (head == null && tail == null) {
			head = node;
			tail = node;
			tail.next = null;
		}
		
		else {
			head.prev = node;
			node.next = head;
			head = node;
		}
	}
	
	public void remove(Node t, int data) {
		
		// empty list
		if (head == null && tail == null) {
			System.out.println("Empty List");
		}
		else if (head == tail && head.data == data) {
			// one node
			head = tail = null;
		}
		else if (head.data == data) {
			// data at head
			head = head.next;
			head.prev = null;
		}
		else if(tail.data == data) {
			tail = tail.prev;
			tail.next = null;
		}
		else if (t.data == data){
			t.prev.next = t.next;
			t.next.prev = t.prev;
		}
		else {
			remove(t.next, data);
		}
	}
	
	public void remove(int data) {
		Node h = head;
		remove (h, data);
	}
	
	public void removeDups(Node n) {
		// Iterate through the linkedList, adding each element to a Hash Table when we
		// discover a duplicate element, we remove the element and continue iterating.
		HashSet<Integer> set = new HashSet<>();
		
		// Node to hold prev and current
		Node current = n;
		Node previous = null;
		
		while (current != null) {
			if (set.contains(current.data)) {
				previous.next = current.next;
			}
			else {
				set.add(current.data);
				previous = current;
			}
			
			current = current.next;
		}
	}
	
	public void removeDups() {
		Node h = head;
		removeDups(h);
	}
	
	public void removeDupsWithoutBuffer(Node n) {
		
		Node current = n;
		
		while (current != null) {
			/* Remove all future nodes that have the same value */
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				}
				else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	
	public void removeDupsWithoutBuffer() {
		Node n = head;
		removeDupsWithoutBuffer(n);
	}
	
	public void display() {
		 Node h = head;
		 while (h != null) {
			 System.out.println(h.data);
			 h = h.next;
		 }
	}
	
	
	
	
	public static void main(String[] args) {
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		
		doublyLinkedList.insert(5);
		doublyLinkedList.insert(1);
		doublyLinkedList.insertAtStart(7);
		doublyLinkedList.insert(5);
		
		doublyLinkedList.removeDups();
		doublyLinkedList.display();

	}
	
	
	
	
	
	
	
	
	
	
}
