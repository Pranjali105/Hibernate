package com.practise.dao.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.dao.intrfc.EmployeeDAOInterface;
import com.practise.hibernate.util.HibernateUtil;
import com.practise.pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAOInterface {

	public void addEmployeeDeatils(List<Employee> lst) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Iterator<Employee> itr = lst.iterator();

		while (itr.hasNext()) {
			Employee e = itr.next();

			Transaction transaction = session.beginTransaction();
			
			session.save(e);
			
			session.getTransaction().commit();
			}
		HibernateUtil.closeSessionFactoryAndSession(factory, session);
	}

	public List<Employee> getEmployeeDeatils() {

		List<Employee> lst = new LinkedList<Employee>();

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("from Employee");

		lst = query.list();

		transaction.commit();

		HibernateUtil.closeSessionFactoryAndSession(factory, session);

		return lst;

	}

	public List<Employee> getEmployeesDetails(String name) {

		List<Employee> lst = new LinkedList<Employee>();

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Transaction transaction = session.beginTransaction();

		String hql = "from Employee emp where emp.name =:name";

		Query query = session.createQuery(hql);

		query.setParameter("name", name);

		System.out.println(hql);

		lst = query.list();

		transaction.commit();

		HibernateUtil.closeSessionFactoryAndSession(factory, session);

		return lst;

	}

	public void updateEmployee(String column_name, String value) {
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Transaction transaction = session.beginTransaction();

		String hql = "update Employee set " + column_name + " = '" + value + "'";

		Query query = session.createQuery(hql);

		int i = query.executeUpdate();

		transaction.commit();

		HibernateUtil.closeSessionFactoryAndSession(factory, session);
	}

	public void updateEmployee(String column_name, String value, String name) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Transaction transaction = session.beginTransaction();

		String hql = "update Employee emp set " + column_name + " = '" + value + "' where emp.name=:name1";

		Query query = session.createQuery(hql);
		query.setParameter("name1", name);

		int i = query.executeUpdate();

		transaction.commit();

		HibernateUtil.closeSessionFactoryAndSession(factory, session);
	}

	public void deleteEmployeeDetails() {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Transaction transaction = session.beginTransaction();

		String hql = "delete from Employee";

		Query query = session.createQuery(hql);

		int i = query.executeUpdate();

		transaction.commit();

		HibernateUtil.closeSessionFactoryAndSession(factory, session);

	}

	public void deleteEmployeeDetails(String name) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Transaction transaction = session.beginTransaction();

		String hql = "delete from Employee emp where emp.name=:name";

		Query query = session.createQuery(hql);
		query.setParameter("name", name);

		int i = query.executeUpdate();

		transaction.commit();

		HibernateUtil.closeSessionFactoryAndSession(factory, session);

	}

}
