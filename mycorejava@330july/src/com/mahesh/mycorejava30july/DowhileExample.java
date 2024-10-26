package com.mahesh.mycorejava30july;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
        int choice;
        int count=0;
        
        Scanner sc=new Scanner(System.in);
       
	do {
		System.out.println("Enter Your Name");
		System.out.println("Welcome "+ sc.nextLine());
		count++;
		
		System.out.println("Press 1 if you want more enteries else press 0");
		choice=sc.nextInt();
		sc.nextLine();
     
	}while(choice!=0);
	System.out.println("you entered " +count + " names");
	
	sc.close();
	}

}
