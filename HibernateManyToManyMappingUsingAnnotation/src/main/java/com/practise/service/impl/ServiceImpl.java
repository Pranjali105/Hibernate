package com.practise.service.impl;

import java.util.List;

import com.practise.dao.impl.DAOImpl;
import com.practise.pojo.Employee;
import com.practise.service.intrfc.ServiceInterface;

public class ServiceImpl implements ServiceInterface{

	public void insertEmployeeDetails(List<Employee> emp_lst) {
		
		DAOImpl daoImpl = new DAOImpl();
		daoImpl.insertEmployeeDetails(emp_lst);
		
	}

}
