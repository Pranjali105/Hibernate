package com.practise.service.impl;

import java.util.List;

import com.practise.dao.impl.EmployeeDAOImpl;
import com.practise.pojo.Employee;
import com.practise.service.intrfc.EmployeeServiceInterface;

public class EmployeeServiceImpl implements EmployeeServiceInterface {

	EmployeeDAOImpl daoImpl = new EmployeeDAOImpl();
	
	public void addEmployeeDetails(List<Employee> lst) {
		
		daoImpl.addEmployeeDeatils(lst);
	}

	public List<Employee> getEmployeeDeatils() {
		
		return daoImpl.getEmployeeDeatils();
	}

	public List<Employee> getEmployeesDetails(String name) {
		
		return daoImpl.getEmployeesDetails(name);
	}
	
	public void updateEmployee(String column_name, String value)
	{
		daoImpl.updateEmployee(column_name, value);
	}
	
	public void updateEmployee(String column_name, String value, String name)
	{
		daoImpl.updateEmployee(column_name, value, name);
	}
	
	public void deleteEmployeeDetails()
	{
		daoImpl.deleteEmployeeDetails();
	}

	public void deleteEmployeeDetails(String name) {
		daoImpl.deleteEmployeeDetails(name);
	}
	
}
