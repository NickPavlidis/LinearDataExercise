package ldex;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		// Stack declarations and initialization
		Stack<Integer> stack = new Stack<>();
		// add elements at the top of the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		// check the first element
		int top = stack.peek();
		System.out.println("top element: " + top);
		// remove and hold the first element
		int first = stack.pop();
		System.out.println("popped element: " + first + "\n" + stack);
		// check the first element
		top = stack.peek();
		System.out.println("top element: " + top);
		}
		}

