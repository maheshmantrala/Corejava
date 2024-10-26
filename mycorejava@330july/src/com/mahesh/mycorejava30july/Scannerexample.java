package com.mahesh.mycorejava30july;

import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  
		  System.out.print("Enter name is:");
		    String name=sc.nextLine();
		    
		    System.out.print("Enter age is:");
		    int age= sc.nextInt();
		    
		    System.out.println("Your Name is:"+name+  "\n And \n Your  Age is:"+age);
		    
		       sc.close();

	}

}
