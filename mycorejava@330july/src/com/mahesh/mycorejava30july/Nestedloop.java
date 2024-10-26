package com.mahesh.mycorejava30july;

import java.util.Scanner;

public class Nestedloop {

	public static void main(String[] args) {

	
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the value of n");
	int n= sc.nextInt();
	
	//spaces
	for(int i=1;i<=n;i++) {
		for (int j=1;j<=n-i;j++) {
			System.out.print(" ");
			
		}
		//stars
		
		for (int k=1;k<=2*i-1;k++) {
		
				if(k==1 || k==2 * i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
		}
		System.out.println();
	}
	
	
	//reverse
	//space
	for (int i=n;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		
		//stars
		
		for(int k=1;k<=2*i-1;k++) {
			if(k==1|| k==2*i-1) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	}

}
