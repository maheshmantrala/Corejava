package com.mahesh.mycorejava30july;

import java.util.Scanner;

public class ForloopExample {

	public static void main(String[] args) {

		  String cities[]=new String[10];
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<5;i++) {
			 cities[i]=sc.nextLine();
		}
		sc.close();
	
		for(int i=0;i<5;i++) {
	System.out.println((i+1)+"."+ "The names of entered cities are: " +cities[i] );
		}
		
		

		}

}
