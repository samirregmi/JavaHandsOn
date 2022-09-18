package com.ZorbaHandsOn;

import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee emps[] = new Employee[1];
		for (int i = 0;i<1; i++) {
			
		System.out.println("Id:");
		int id = scan.nextInt();
		
		System.out.println("Name:");
		String name= scan.next();
		
		System.out.println("Address:");
		String address= scan.next();
		
		System.out.println("Salary:");
		double salary= scan.nextDouble();
		
		System.out.println("Department:");
		String department= scan.next();
		
		Employee emp = new Employee(id, name, address, salary, department);
		emps[i]=emp;
	
		}
		
		for(Employee employee:emps) {
		employee.getEmployeeDetails();	
			if(employee.eligibleForPromotions()== true);
			System.out.println(employee.getName());
		}
	}
		
		}
	


