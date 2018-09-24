package com.cs.ajinkya.data_structures.linkedlist;

public class ListNode {
	
	private static int count = 0;
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
		count++;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public int listLenght() {
		return this.count;
	}
	
	
	

}
