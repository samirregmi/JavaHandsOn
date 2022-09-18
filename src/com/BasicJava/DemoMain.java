package com.BasicJava;

import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee emp[] = new Employee[3];
		for (int i = 0;i<3;i++) {
		System.out.println("Enter EmployeeId");
		int employeeId = scan.nextInt();
		
		System.out.println("Enter EmployeeName");
		String employeeName = scan.next();
		
		System.out.println("Enter EmployeeAddress");
		String employeeAddress = scan.next();
		
		System.out.println("Enter EmployeeSalary");
		double employeeSalary = scan.nextDouble();
		
		System.out.println("Enter EmployeeDepartment");
		String employeeDepartment = scan.next();
		
		Employee employee = new Employee(employeeId, employeeName, employeeAddress, employeeSalary, employeeDepartment);
		emp[i] = employee;
		}
		for(Employee employees:emp) {
			employees.getEmployeeDetails();
			
			if(employees.eligibleForPromotions()==true) {
				System.out.println(employees.getEmployeeName());
				
			}
			
		}
		
			
		}
		
	}


