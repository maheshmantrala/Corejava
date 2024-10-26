package com.mahesh.mycorejava_1Aug;

public class StringBuilderEx {

	public static void main(String[] args) {

		StringBuilder  buil=new StringBuilder("Hello, ");
		buil.append("StaingBuilder");
		System.out.println(buil);
		System.out.println("using setchar method");
		buil.setCharAt(9, 'r');
		System.out.println(buil);
		System.out.println("using isempty method");
		boolean c= buil.isEmpty();
		System.out.println(c);
		System.out.println("using subsequence method");
		CharSequence c1=buil.subSequence(7, 12);
		System.out.println(c1);
	}

}
