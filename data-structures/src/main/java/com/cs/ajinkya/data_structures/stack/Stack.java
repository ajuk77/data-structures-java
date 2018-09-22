package com.cs.ajinkya.data_structures.stack;

public class Stack {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[size];
		this.top = -1;
	}
	
	public void push(int value) {
		top++;
		stackArray[top] = value;
	}
	
	public long pop( ) {
		int old_top = top;
		top--;
		return stackArray[old_top];
	}
	
	public long peak() {
		if(top == -1) {
			return -1;
		}
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (maxSize-1));
	}

}
