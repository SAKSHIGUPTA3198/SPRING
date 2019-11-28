package com.lti.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		
		
	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      
      EmployeeService service = context.getBean("service",EmployeeService.class);
      Employee employee = context.getBean("employee",Employee.class);
      
      Scanner s = new Scanner(System.in);
     
      
      System.out.println("enter emp name:");
      employee.setEmployeeName(s.next());
      
  System.out.println("enter emp salary");
     employee.setEmployeeSalary(s.nextDouble());

    boolean result = service.addEmployee(employee);
      if(result){
	List<Employee> list = service.findAllEmployees();
	for(Employee emp :list){
		System.out.println(emp);
	}
}else{
	System.out.println("employee data not saved");
}
     
      
	}
	

}
