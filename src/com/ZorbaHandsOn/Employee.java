package com.ZorbaHandsOn;



public class Employee {

	private int id;
	private String name;
	private String address;
	private double salary;
	private String department;
	public Employee(int id, String name, String address, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void getEmployeeDetails() {
		System.out.println(id +" "+name+" "+address+" "+salary+" "+department);
		
	}
	public boolean eligibleForPromotions() {
		if(salary<1000) {
		System.out.println("Eligible");	
		double salaryUpadate = updateSalary();
		System.out.println(salaryUpadate);
		return true;
		
		}
		else {
			System.out.println("Not Eligible");
			return false;
		}
		
		}
		public double updateSalary() {
		double updatedSalary= salary+(salary*20/100);	
		return updatedSalary;
			}
		}
