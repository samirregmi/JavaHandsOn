package com.BasicJava;

public class Employee {
private int employeeId;
private String employeeName;
private String employeeAddress;
private double employeeSalary;
private String employeeDepartment;

public Employee(int employeeId, String employeeName, String employeeAddress, double employeeSalary,
		String employeeDepartment) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeeSalary = employeeSalary;
	this.employeeDepartment = employeeDepartment;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public void getEmployeeDetails() {
	System.out.println(employeeId+" "+employeeName+" "+employeeAddress+" "+employeeSalary+" "+employeeDepartment );
	
}
public boolean eligibleForPromotions() {
if(employeeSalary<1000) {
	System.out.println("You are Eligible For Promotion");
	double updatedSalary = updateSalary();
	System.out.println(updatedSalary);
	return true;
	
	
}
else {
	System.err.println("You are not Eligible For this Promotions Thanks!");
	return false;
}
}
 public double updateSalary() {
	 double salaryUpdate = employeeSalary+(employeeSalary*20/100);
	 return salaryUpdate;
 }
}