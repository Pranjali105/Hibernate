package com.practise.dai.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.dao.intrfc.DAOInterface;
import com.practise.hibernate.util.HibernateUtil;
import com.practise.pojo.Student;

public class DAOImpl implements DAOInterface {

	public void insertStudentDetails(List<Student> stud_lst) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Iterator<Student> itr = stud_lst.iterator();

		while (itr.hasNext()) {

			Transaction transaction = HibernateUtil.getTransaction(session);

			Student s = itr.next();

			session.save(s);

			transaction.commit();

		}

		HibernateUtil.closeSessionAndSessionFactory(session, factory);

	}

	public List<Student> getStudentDetails() {
		
		List<Student> get_student_list = new ArrayList<Student>();
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = HibernateUtil.getSession(factory);
		
		Transaction transaction = HibernateUtil.getTransaction(session);
		
		/* String hql = "select from Student"; */
		
		Query query = session.createQuery("from Student");
		
		get_student_list = query.list();
		
		transaction.commit();
		
		HibernateUtil.closeSessionAndSessionFactory(session, factory);
		
		return get_student_list;
	}

	/*
	 * public void deleteStudentDetails() {
	 * 
	 * SessionFactory factory = HibernateUtil.getSessionFactory();
	 * 
	 * Session session = HibernateUtil.getSession(factory);
	 * 
	 * Transaction transaction = HibernateUtil.getTransaction(session);
	 * 
	 * String hql =
	 * "delete from student stud, university uni where stud.university_id = uni.university_id"
	 * ;
	 * 
	 * Query query = session.createSQLQuery(hql);
	 * 
	 * int i = query.executeUpdate();
	 * 
	 * transaction.commit();
	 * 
	 * HibernateUtil.closeSessionAndSessionFactory(session, factory); }
	 */

}
