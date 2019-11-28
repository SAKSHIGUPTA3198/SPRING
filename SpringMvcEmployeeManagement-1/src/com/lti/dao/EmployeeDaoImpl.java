package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	private JdbcTemplate template=null;
	
	private static final String INSERT_EMP_RECORD = "Insert Into Emp(Emp_Id, Emp_Name, Emp_Sal) Values (Emp_EmpId.nextval, ?, ?)";
	private static final String DELETE_EMP_RECORD = "Delete From Emp Where Emp_Id=?";
	private static final String UPDATE_EMP_RECORD = "Update Emp Set Emp_Name=?, Emp_Sal=? Where Emp_Id=?";
	private static final String SELECT_EMP_RECORD = "Select * From Emp";
	
	@Override
	public int createEmployee(Employee employee) {
		int result = getTemplate().update(INSERT_EMP_RECORD, employee.getEmployeeName(), employee.getEmployeeSalary());
		return result;
	}
	@Override
	public List<Employee> readAllEmployees() {
		List<Employee> list = getTemplate().query(SELECT_EMP_RECORD, new EmployeeRowMapper());
		return list;
	}
	@Override
	public int deleteEmployee(int employeeId) {
		int result = getTemplate().update(DELETE_EMP_RECORD, employeeId);
		return result;
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		System.out.println(employee);
		int result = getTemplate().update(UPDATE_EMP_RECORD, employee.getEmployeeName(), employee.getEmployeeSalary(), employee.getEmployeeId());
		if(result==1){
			return employee;
		}
		return null;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
}
