package Stack;

public class DStack {
	
	int capacity = 2;
	int stack[] = new int[capacity]; // array of size 5
	int top = 0; // current element in stack
	
	public void push(int data) {
		
		if (size() == capacity) {
			expand();
		}
		
		stack[top] = data;
		top++;
		
	} // END OF push
	
	private void expand() {
		
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity *= 2;
		
	} // END OF expand

	public int pop() {
		
		int data = 0;
		
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;
		
	} // END OF pop
	
	public void shrink() {
		
		int length = size();
		if (length <= (capacity/2)/2) {
			capacity = capacity / 2;
		}
		
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		
		
	} // END OF shrink
	
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
