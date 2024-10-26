package com.mahesh.CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Emp_Database  {

       private List<Employee>emp;
       Scanner sc=new Scanner(System.in);
       
       public Emp_Database() {
    	   emp=new ArrayList<>();
       }
       //To add employee
       public void Add_emp() {
    	   System.out.print("Enter employee ID: ");
    	   String Emp_id =sc.nextLine();
    	   
    	   System.out.print("Enter employee Firstname: ");
    	   String First_name =sc.nextLine();
    	   
    	   System.out.print("Enter employee Lastname: ");
    	   String Last_name =sc.nextLine();
    	   
    	   System.out.print("Enter employee Designation: ");
    	   String Designation =sc.nextLine();
    	   
    	   System.out.print("Enter employee Salary: ");
    	   double Salary =sc.nextDouble();
    	   
    	   System.out.print("Enter employee phonenumber: ");
    	   double Emp_phone =sc.nextDouble();
    	   
     emp.add(new Employee(Emp_id,First_name,Last_name,Designation,Salary, Emp_phone));
    	   
    	   System.out.println("Employee Added Successfully..\n");
       }
       
       //To list employee
       public void List_Emp() {
    	   if (emp.isEmpty()) {
    		   System.out.println("Data is Not Found");
    	   }
    	   else {
    		   for(Employee e:emp) {
    			   System.out.println(e);
    		   }
    	   }
    	   System.out.println();
       }
       
       //to display managers
       
       public void List_managers() {
    	   boolean found=false;
    	   for(Employee e:emp) {
    		   if(e.Designation.equalsIgnoreCase("manager")) {
    			   System.out.print(e);
    			   found=true;
    		   }
    	   }
    	   if(!found) {
    		   System.out.println("No Manager is Found");
    	   }
    	   System.out.println();
       }
       
       //To delete Employee
       
       public void Delete_emp() {
    	   System.out.println("Enter the employee id to delete: ");
    	   sc.nextLine();
    	   String Emp_id=sc.nextLine();
    	   boolean found=false;
    	   for (Employee e:emp) {
    		   if(e.Emp_id.equals(Emp_id))
    		   {
    			   emp.remove(e);
    			   System.out.println("Deleted");
    			   found=true;
    			   break;
    		   }    
    		   }
    	   if(!found) {
    		   System.out.println("Employee not found\n");
    	   }
    	 
       }
       
       public  void Show_menu()
       {
    	 
    		   System.out.println("1. Add an Employee");
          	   System.out.println("2. List the Employees");
          	   System.out.println("3. List the Managers");
          	   System.out.println("4. Delete an Employee data");
          	   System.out.println("5. Exit");
          	   System.out.println("Enter the choice");
          	  
      	  
    	 }}
      
       
       
       

