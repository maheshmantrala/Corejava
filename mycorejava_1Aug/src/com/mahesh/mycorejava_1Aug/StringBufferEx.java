package com.mahesh.mycorejava_1Aug;

public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer buff=new StringBuffer("Some States in India are ");
		buff.append("AndhraPradesh,Bihar,Kerala");
		System.out.println(buff);

		System.out.println("Using Substring Method");
		String sub=buff.substring(12, 34);
		System.out.println("The Substring is: "+sub);

		System.out.println("Using Replace Method");
		buff.replace(25, 34, "Madhyapradesh");
		System.out.println("After replacing: "+buff);

		System.out.println("UsingCharAt method");
		char  ch=buff.charAt(12);
		System.out.println("The character at index 12 is : "+ch);



	}

}
