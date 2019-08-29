package Stack;

public class Runner {
	
	public static void main(String[] args) {
		
		/*Stack stack1 = new Stack();
		
		System.out.println("Empty = " + stack1.isEmpty());

		stack1.push(5);
		stack1.push(7);
		stack1.push(3);

		stack1.display();
		System.out.println("Size of stack: " + stack1.size());
		
		System.out.println("popped " + stack1.pop());
		
		System.out.println("Size of stack: " + stack1.size());

		
		stack1.display();
		
		stack1.push(10);
		
		System.out.println("peek: " + stack1.peek());
		
		System.out.println("Empty = " + stack1.isEmpty());*/
		
		DStack dstack1 = new DStack();
		dstack1.push(4);
		dstack1.push(9);
		dstack1.display();
		dstack1.push(7);
		dstack1.push(8);
		dstack1.push(89);
		
		dstack1.pop();
		dstack1.display();
		
		dstack1.pop();
		dstack1.display();
		
		dstack1.pop();
		dstack1.display();
		
		dstack1.pop();
		dstack1.display();
		

		dstack1.display();


		

		
		
		
		
	
		
	}
}
