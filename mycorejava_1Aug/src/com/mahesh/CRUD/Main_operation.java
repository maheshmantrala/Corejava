package com.mahesh.CRUD;

import java.util.Scanner;

public class Main_operation {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);  
		Emp_Database edata=new Emp_Database();
		int option=0;
	do {
	
		
			edata.Show_menu();			
			 option = sc.nextInt();
			switch(option) {
			case 1:
				edata.Add_emp();
				break;
			case 2:
				edata.List_Emp();
				break;
			case 3:
				edata.List_managers();
				break;
			case 4:
				edata.Delete_emp();
				break;
			case 5:
		System.exit(0);
		break;
			   default:
				   System.out.println("Invalid Input\n");
			}
		
		
		}while(option!=5);

		
}
}

