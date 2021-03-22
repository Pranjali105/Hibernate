package com.practise.dao.intrfc;

import java.util.List;

import com.practise.pojo.Employee;

public interface EmployeeDAOInterface {
	
	public void addEmployeeDeatils(List<Employee> lst);
	
	public List<Employee> getEmployeeDeatils();
	
	public List<Employee> getEmployeesDetails(String name);
	
	public void updateEmployee(String column_name, String value);
	
	public void updateEmployee(String column_name, String value, String name);
	
	public void deleteEmployeeDetails();
	
	public void deleteEmployeeDetails(String name);

}
