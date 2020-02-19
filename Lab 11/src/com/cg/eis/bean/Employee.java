package com.cg.eis.bean;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	public Employee(int id,  int salary,String name, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public Employee() {
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee id=" + id + ",Employee name=" + name + ",Employee salary=" + salary + ",Employee designation=" + designation
				+ ",Employee insuranceScheme=" + insuranceScheme ;
	}


	
}
