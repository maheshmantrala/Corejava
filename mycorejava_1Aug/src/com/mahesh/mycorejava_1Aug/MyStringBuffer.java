package com.mahesh.mycorejava_1Aug;

public class MyStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuffer sbuff=new StringBuffer("Hello, ");
      
      sbuff.append("World.Welcome to the java World.");
      sbuff.insert(38,"Mighty");
      sbuff.delete(8,40);
      System.out.println(sbuff +"the length  " +sbuff.length()  + "  "   + " The capacity is  " +sbuff.capacity());
	};

}
