package com.dao.impl.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.practise.dao.impl.EmployeeDAOImpl;
import com.practise.pojo.Employee;

public class EmployeeDAOImplTest {
	
	@Test
	public void testGetEmployeeDetails()
	{
		EmployeeDAOImpl daoImpl = new EmployeeDAOImpl();
		List<Employee> lst = daoImpl.getEmployeeDeatils();
		
		Assert.assertNotNull(lst);
		Assert.assertTrue(lst.size()>=1);
	}
	
	@Test
	public void testGetEmployeeDetailsWithName()
	{
		EmployeeDAOImpl daoImpl = new EmployeeDAOImpl();
		List<Employee> lst = daoImpl.getEmployeesDetails("A");
		
		Assert.assertNotNull(lst);
		Assert.assertTrue(lst.size()>=1);
		Assert.assertEquals(lst.get(0).getAge(), 10);
	}

}
