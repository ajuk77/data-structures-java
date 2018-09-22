package com.cs.ajinkya.data_structures.adt;

public class Counter {
	
	private String name = null;
	private int value = 0;
	
	public Counter(String name) {
		this.name = name;
	}
	
	public int getCounterValue() {
		return value;
	}
	
	public void increment() {
		value++;
	}
	
	@Override
	public String toString() {
		return "Name:" + name + ", value:" + value;
	}

}
