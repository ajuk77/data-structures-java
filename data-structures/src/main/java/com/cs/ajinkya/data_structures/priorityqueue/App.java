package com.cs.ajinkya.data_structures.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class App {
	
	public static void main(String[] args) {
		
		Queue<Integer> intQueue = new PriorityQueue<Integer>();
		Random random = new Random();
		for(int i=0; i< 7; i++) {
			intQueue.add(random.nextInt(100));
			
		}
		
		for(int i=0; i<7; i++) {
			System.out.println(intQueue.poll());
		}
		
		System.out.println("Elements in decending order");
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new DecendingOrder());
		for(int i=0; i<10; i++) {
			queue.add(random.nextInt(100));
		}
		System.out.println(queue.size());
		while(!queue.isEmpty()) {
			System.out.println("Queue Element:"+ queue.poll());
		}
		
	}

}

class DecendingOrder implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o2-o1);
	}
	
}


