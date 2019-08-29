package JavaCollections;
import java.util.*;

public class Stacks {
	
	// write a function to check whether a stack has a target int
	// given the stack and integer, and preserve the stack in its
	// original order
	
	static boolean findInStack(Stack<Integer> stack, int target) {
		
		boolean present = false;
		Stack<Integer> temp = new Stack<>();
		
		// checking if element is in stack
		while (!stack.isEmpty()) {
			int el = stack.pop();
			temp.push(el);
			if(el == target) {
				present = true;
			}
		}
		
		// putting stack back to original form
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		
		return present;
	}
	


	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Is stack empty?: " + stack.isEmpty());
		
		stack.push(5);
		stack.push(8);
		stack.push(3);
		stack.push(10);
		stack.push(11);
		
		System.out.println("Is stack empty?: " + stack.isEmpty());

		System.out.println(stack);
		
		System.out.println("element 8 is in position: " + stack.search(8) + " from the top of the stack");

		
		System.out.println("top element in stack: " + stack.peek());
		
		System.out.println("Remove and return last element in stack: " + stack.pop());
		
		System.out.println(stack);
		
		System.out.println("element 8 is in position: " + stack.search(8) + " from the top of the stack (starting index 1");
	
		Iterator itr = stack.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(findInStack(stack, 8));
		
		
		System.out.println("element 10 in stack?: " + stack.contains(10));
		
		
		// fizz buzz problem
		// print nums 1-00
		// for mult of 3 print fizz
		// for mult of 5 print buzz
		// for mult of both, write :fizzbuzz
		
		
		for (int i = 1; i < 101; i++) {
			boolean fizz = i % 3 == 0;
			boolean buzz = i % 5 == 0;
			if (fizz && buzz) {
				System.out.println("FizzBuzz");
			}
			else if (fizz) {
				System.out.println("Fizz");
			}
			else if (buzz) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
		
	}
}
