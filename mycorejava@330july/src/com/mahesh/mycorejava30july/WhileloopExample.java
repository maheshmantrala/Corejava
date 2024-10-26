package com.mahesh.mycorejava30july;

public class WhileloopExample {

	public static void main(String[] args) {

		int i=10;
		while(i<11){
			System.out.println("the values of i are: "+ i++);
		}
		System.out.println("the values of outside loop:  "+ i++);   
	}

}
