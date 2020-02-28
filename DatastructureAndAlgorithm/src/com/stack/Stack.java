package com.stack;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackClass stack = new StackClass();
		stack.push(5);
		stack.push(3);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		stack.push(9);
		stack.show();
		
		System.out.println("\npeek value");
		System.out.println(stack.peek());
		
		System.out.println("\npop value");
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		
		System.out.println("\npeek value");
		System.out.println(stack.peek());
		
		
		System.out.println("\npop value");
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.println();
		System.out.print(stack.pop());
		

		
	}

}
