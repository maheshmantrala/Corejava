package com.sush.lambda;

public class Main {

	public static void main(String[] args) {

		Welcome_interface w = (name) ->{
			return  "welcome " + name ;
		};
		
		System.out.println(w.say("mahesh"));

	}
	

}
