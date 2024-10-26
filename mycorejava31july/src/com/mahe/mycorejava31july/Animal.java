package com.mahe.mycorejava31july;

public class Animal {

	int legs;

	public Animal(int legs) {

		this.legs = legs;
	}
	public void move() {
		System.out.println("i move");
	}
	public void legs(){
		System.out.println("i have "+legs);
	}
	public void speak() {
		System.out.println("i can speak");
	}
}
