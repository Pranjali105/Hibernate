package com.practise.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.dao.intrfc.EmployeeDAOInterface;
import com.practise.hibernate.util.HibernateUtil;
import com.practise.pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAOInterface{

	public void addEmployeeDetails(List<Employee> elst) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = HibernateUtil.getSession(factory);
		
		Transaction transaction = session.beginTransaction();
		
		Iterator itr = elst.iterator();
		
		while(itr.hasNext())
		{
			Employee e = (Employee) itr.next();
			
			session.save(e);
			transaction.commit();
		}
		
		HibernateUtil.closeFactorySessionAndSession(factory, session);
		
	}

}
