package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;
@Service("service")
public class EmployeeServiceImpl  implements EmployeeService{
	
	@Autowired
	
	private EmployeeDao dao;

	public boolean addEmployee(Employee employee) {
		 int result = getDao().createEmployee(employee);
		 if(result==1){
			 return true;
		 }
			 else{
				 return false;
		 }
	}

	public List<Employee> findAllEmployees() {
		List<Employee> list = getDao().readAllEmployees();
		return list;
	}
	public boolean removeEmployee(int employeeId) {
		int result = getDao().deleteEmployee(employeeId);
		 if(result==1){
			 return true;
		 }
			 else{
				 
				 return false;
		 }
		
	}

	public Employee modifyEmployee(Employee employee) {
		Employee employee2 = getDao().updateEmployee(employee);
		
		return employee2;
	}

	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

}
