package com.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.intrfc.DAOInterface;
import com.hibernate.util.HibernateUtil;
import com.practise.pojo.Address;

public class DAOImpl implements DAOInterface {

	public void insertUserDetails(List<Address> address_lst) {

		SessionFactory factory = HibernateUtil.getseSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Iterator<Address> itr = address_lst.iterator();

		while (itr.hasNext()) {
			
			Transaction transaction = HibernateUtil.getTransaction(session);

			Address address = itr.next();

			session.saveOrUpdate(address);

			transaction.commit();
		}

		HibernateUtil.closeSessionAndSessionFactory(session, factory);

	}
	
	/*
	 * public void insertUserDetails(Map<User,Address>mp) { SessionFactory factory =
	 * HibernateUtil.getseSessionFactory();
	 * 
	 * Session session = HibernateUtil.getSession(factory);
	 * 
	 * //Iterator<User> itr = user_lst.iterator();
	 * 
	 * 
	 * while (itr.hasNext()) {
	 * 
	 * Transaction transaction = HibernateUtil.getTransaction(session);
	 * 
	 * User user = itr.next();
	 * 
	 * session.save(user);
	 * 
	 * transaction.commit(); }
	 * 
	 * for(Map.Entry<User, Address> entry: mp.entrySet()) { User
	 * user=entry.getKey(); Address address=entry.getValue(); Transaction
	 * transaction = HibernateUtil.getTransaction(session);
	 * session.saveOrUpdate(address); user.setAddress(address);
	 * session.saveOrUpdate(user); transaction.commit();
	 * 
	 * }
	 * 
	 * HibernateUtil.closeSessionAndSessionFactory(session, factory);
	 */
		

}
