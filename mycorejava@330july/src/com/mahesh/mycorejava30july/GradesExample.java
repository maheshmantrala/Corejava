package com.mahesh.mycorejava30july;

import java.util.Scanner;

public class GradesExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		  
		  System.out.print("Please Enter your Marks:");
		    int marks= sc.nextInt(); 
	         sc.close();
	         if( marks<=0 || marks>100) {
		   	    	System.out.println(" Entered Marks are Invalid");
		   	    }
	         
	         else {
	        	 
		    switch(marks/10) {

		    case 5:
			System.out.println("your  grade is:D");
		    	break;
		    	
		    case 6:
		    	
		    	System.out.println("your  grade is:C");  	
		    	   break; 
		    	
		    case 7:
		 
		    	System.out.println("your  grade is:B");
		    	break;
		    	
		    case 8:
		
		   System.out.println("your  grade is:A");
		    	break;
		    	
		    case 9,10:
		    	
		    	  System.out.println("your  grade is:A+");
	    	break;	
		 
		    default:
		    	  System.out.println("your  grade is:Fail");		   
		}
		   
    }

	}
}


