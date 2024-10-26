package com.mahe.mycorejava31july;

public class Bird extends Animal {
	String name;

	public Bird(int legs, String name) {
		super(legs);
		this.name = name;
	}
	public void identity() {
		System.out.println("i am " +name +  "and i have " +this.legs);
	}
	public void move() {
		System.out.println("i can dance");
	}

}
