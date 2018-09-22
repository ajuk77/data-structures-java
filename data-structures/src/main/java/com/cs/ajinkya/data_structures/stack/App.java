package com.cs.ajinkya.data_structures.stack;

public class App {
	
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		while(!stack.isEmpty()) {
			long value = stack.pop();
			System.out.println(value);
		}
	}

}
