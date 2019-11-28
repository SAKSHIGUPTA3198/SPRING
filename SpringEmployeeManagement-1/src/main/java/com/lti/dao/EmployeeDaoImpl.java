package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static List<Employee> employees ;
	
	public EmployeeDaoImpl(){
		System.out.println("object of empdaoimpl created");

		//employees = new ArrayList<Employee>();
	}
	
	public boolean createEmployee(Employee employee) {
		boolean result = getEmployees().add(employee);
		return result;
	}

	public List<Employee> readAllEmployees() {
	
		return getEmployees();
	}

	public static List<Employee> getEmployees() {
		return employees;
	}

	public static void setEmployees(List<Employee> employees) {
		EmployeeDaoImpl.employees = employees;
	}

}
