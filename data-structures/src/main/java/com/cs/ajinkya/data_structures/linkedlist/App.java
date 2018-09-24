package com.cs.ajinkya.data_structures.linkedlist;

public class App {
	
	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insertAtBegin(100);
		linkedList.insertAtBegin(50);
		linkedList.insertLast(300);
		
		linkedList.displayList();
		System.out.println("\nLength of the list: "+linkedList.getLength());
	}

}
