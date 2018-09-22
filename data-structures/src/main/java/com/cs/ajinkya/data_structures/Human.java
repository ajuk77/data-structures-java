package com.cs.ajinkya.data_structures;

public class Human {
	
	private String name;
	private int age;
	private int height;
	private String eyeColor;
	
	public Human() {
		
	}
	
	public Human(String name, int age, int height, String eyeColor) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public String getEyeColor() {
		return eyeColor;
	}
	
	public void speak() {
		System.out.println("Name: " + name);
		System.out.println("Age: "+ age);
		System.out.println("Height: "+ height);
		System.out.println("EyeColor: "+ eyeColor);
	}
	
	public void eat() {
		System.out.println(name + " is eating..");
	}
	
	public void walk() {
		System.out.println(name + " is walking..");
	}
	
	public void work() {
		System.out.println(name + " is working..");
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ",Age:" + age + ",Height:" + height + ",EyeColor:"+ eyeColor;
	}
	

}
