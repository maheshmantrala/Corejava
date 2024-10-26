package com.mahesh.CRUD;

public class Employee {
    
	  String  Emp_id;
	  String  First_name;
	  String Last_name;
	  String Designation;
	  double Salary;
	  double Emp_phone;
	
	
	public Employee(String emp_id, String first_name, String last_name, String designation, double salary,
			double emp_phone) {
		
		Emp_id = emp_id;
		First_name = first_name;
		Last_name = last_name;
		Designation = designation;
		Salary = salary;
		Emp_phone = emp_phone;
	}
	public String getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(String emp_id) {
		Emp_id = emp_id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public double getEmp_phone() {
		return Emp_phone;
	}
	public void setEmp_phone(double emp_phone) {
		Emp_phone = emp_phone;
	}
	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", First_name=" + First_name + ", Last_name=" + Last_name
				+ ", Designation=" + Designation + ", Salary=" + Salary + ", Emp_phone=" + Emp_phone + "]";
	}
	  
	
}
