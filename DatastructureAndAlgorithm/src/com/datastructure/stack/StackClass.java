package com.datastructure.stack;

public class StackClass {

	int[] stack = new int[5];
	int top=0;
	
	public boolean push(int data) {

		if (isStackFull()) {
			System.out.println("Stack is overflow");
			return false;
		}else {
			stack[top] = data;
			top++;
			return true;
		}
	}
	
	public void show() {
		for (int i : stack) {
			System.out.print(i + " ");
		}
	}
	
	public boolean isStackFull() {
		if (top == stack.length) {
			return true;
		}
		return false;
	}
	
	
	public int pop() {
		top--;
		if (isStackEmpty()) {
			System.out.println("underflow");
			return top;
		}else {
			int data = stack[top];
			return data;
		}
		
	}
	
	public boolean isStackEmpty() {
		if (top < 0) {
			return true;
		}
		return false;
	}
	
	
	public int peek() {
		int data = stack[top-1];
		return data;
	}
	
	public void deleteStack() {
		stack = null;
		if (stack == null) {
			System.out.println("Stack delted succssfully");
		}

	}
}
