package com.practise.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.dao.intrfc.DAOInterface;
import com.practise.hibernate.util.HibernateUtil;
import com.practise.pojo.Employee;

public class DAOImpl implements DAOInterface{

	public void insertEmployeeDetails(List<Employee> emp_lst) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = HibernateUtil.getSession(factory);
		
		Iterator<Employee> itr = emp_lst.iterator();
		
		while(itr.hasNext())
		{
		Transaction transaction = HibernateUtil.getTransaction(session);
		
		Employee e = itr.next();
		
		session.save(e);
		
		transaction.commit();
		}
		
		HibernateUtil.closeSessionAndSessionFactory(session, factory);
	
	}
}
