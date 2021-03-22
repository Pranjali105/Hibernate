package com.practise.service.impl;

import java.util.List;

import com.practise.dao.impl.EmployeeDAOImpl;
import com.practise.pojo.Employee;
import com.practise.service.intrfc.EmployeeServiceInterface;

public class EmployeeServiceImpl implements EmployeeServiceInterface{

	public void addEmployeeDeatils(List<Employee> elst) {
		
		EmployeeDAOImpl daoImpl = new EmployeeDAOImpl();
		daoImpl.addEmployeeDetails(elst);
		
	}

}
