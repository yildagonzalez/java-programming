package Stack;

public class Stack {
	
	int stack[] = new int[5]; // array of size 5
	int top = 0; // current element in stack
	
	public void push(int data) {
		
		if (top == 5) {
			System.out.println("Stack is full");
		}
		else {
			stack[top] = data;
			top++;
		}
	
		
	} // END OF push
	
	public int pop() {
		
		int data = 0;
		
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
		
	} // END OF pop
	
	public int peek() {
		
		int data;
		data = stack[top-1];
		return data;
	
	} // END OF peek
	
	public int size() {
		
		return top;
	} // END OF size
	
	public boolean isEmpty() {
		
		return top <= 0;
	}
	
	public void display() {
		
		for (int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	} // END OF display
	
	
	
	
	
	
	
	
}
