package com.lti.ui;

import com.lti.model.Address;
import com.lti.model.Employee;

public class Main {

	public static void main(String[] args) {
		Employee employee =new Employee(1000,"Shalene" , 5000);
		Address address= new Address("ABC Road", "Mumbai", "400050");
		//employee.setAddress(address);
		
		System.out.println(employee);
		System.out.println(employee.getAddress());
	}

}
