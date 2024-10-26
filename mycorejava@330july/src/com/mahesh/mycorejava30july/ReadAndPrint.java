package com.mahesh.mycorejava30july;

import  java.io.*;


public class ReadAndPrint {

	public static void main(String[] args) throws IOException {
		
	InputStreamReader input =new InputStreamReader(System.in);
	
	BufferedReader mybuffer=new BufferedReader(input);
	System.out.print("Enter name is:");
	

	String name=mybuffer.readLine();

	System.out.print("Enter age is:");
	int age=Integer.parseInt(mybuffer.readLine());
	System.out.println("Your Name is:"+name+  "\n and Your  Age is:"+age); 
	}
	
	}
