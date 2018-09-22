package com.cs.ajinkya.data_structures.adt;

public class App {
	
	public static void main(String[] args) {
		Counter counter = new Counter("mycounter");
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		System.out.println(counter.getCounterValue());
	}

}
