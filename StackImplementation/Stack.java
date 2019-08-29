package StackImplementation;

// Stack implementation using linked list

public class Stack {
	
	Node top; // top element of stack to pop
	
	// method that pops and returns top elements
	public int pop() {
		if (top == null) {
			return -1;
		}
		else {
			Node temp = new Node(top.val); // temp node with top value 
			top = top.next; // update top after popping
			return temp.val;
		}
	}
	
	// method that returns top element
	public int peek() {
		if (top != null) {
			return top.val;
		}
		return -1;
	}
	
	public void push(int data) {
		 Node n = new Node(data); // initialize new node with dat
		 
		 n.next = top;
		 top = n;
	}
	
	public boolean search(Stack s, int data) {
		Stack tmpStack = new Stack();
		boolean found = false;
		int poppedVal = 0;
		
		 while (!s.isEmpty()) {
			 poppedVal = s.pop();
			 tmpStack.push(poppedVal);
			 if (poppedVal == data) {
				 found = true;
			 }
		 }
		 
		 while (!tmpStack.isEmpty()) {
			 s.push(tmpStack.pop());
		 }
		 return found;
	}
	
	
	public boolean isEmpty() {
		return top == null;
	}
	
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(5);
		s.push(9);
		s.push(11);
		
	//	System.out.println("Popped: " + s.pop());
		
		System.out.println("Peek: " + s.peek());
		
		System.out.println("Search: " + s.search(s,11));
		
		while (!s.isEmpty()) {
			System.out.println("Popping: " + s.pop());
		}
		
		
		
	
	}
	
}
