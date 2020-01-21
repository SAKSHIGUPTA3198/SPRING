package com.lti.model;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(scopeName="prototype")


public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	@Autowired
	@Qualifier("address1")
	private Address address;
	
	
	public Employee(){
		
	}

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
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

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	public Address getAddress() {
		return address;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init");
		
	}
	@PreDestroy
	public void delete(){
		System.out.println("delete");
		
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}