package com.cs.ajinkya.data_structures;

public class Animal {
	
	private int age;
	private String gender;
	private int weightInLbs;
	
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public int getWeightInLbs() {
		return weightInLbs;
	}
	
	public void eat() {
		System.out.println("Animal is eating...");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping...");
	}
	
	@Override
	public String toString() {
		return "Animal -> Age:"+ age + ", Gender:" + gender + ",WeightInLbs:" + weightInLbs;
	}
	
	

}
