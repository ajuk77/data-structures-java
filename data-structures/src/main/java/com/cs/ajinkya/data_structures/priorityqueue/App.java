package com.cs.ajinkya.data_structures.priorityqueue;

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
		
	}

}


