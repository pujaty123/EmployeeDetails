package com.githubpracticecode;

public class Employee {

	
		static String name;
		static int empId;
		double salary;
		 Employee(String name,int empId,double salary)
		{
			this.name=name;
			this.empId=empId;
			this.salary=salary;
		}
		 public static void main(String[] args) {
			Employee e=new Employee("Akash",143,2.4);
			System.out.println(name);
			System.out.println(empId);
		}
	}


