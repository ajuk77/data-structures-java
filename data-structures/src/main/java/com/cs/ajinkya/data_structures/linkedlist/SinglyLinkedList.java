package com.cs.ajinkya.data_structures.linkedlist;

public class SinglyLinkedList {
	
	ListNode head;
	private int length;
	
	public SinglyLinkedList() {
		length = 0;
	}
	
	public boolean isEmpty() {
		return (null == head);
	}
	
	public void insertAtBegin(int data) {
		ListNode node = new ListNode(data);
		node.setNext(head);
		head = node;
		length++;
	}
	
	public ListNode deleteFirst() {
		if(null == head) {
			return null;
		}
		ListNode tempNode = head;
		head = head.getNext();
		tempNode.setNext(null);
		return head;
	}
	
	public void displayList() {
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public void insertLast(int data) {
		ListNode temp = head;
		ListNode newNode = new ListNode(data);
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}
	
	public int getLength() {
		return length;
	}

}
