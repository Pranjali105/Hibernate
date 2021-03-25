package com.practise.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.dao.intrfc.DAOInterface;
import com.practise.hibernate.util.HibernateUtil;
import com.practise.pojo.Question;

public class DAOImpl implements DAOInterface {

	public void insertQuestionAnswer(List<Question> que_lst) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = HibernateUtil.getSession(factory);

		Iterator<Question> itr = que_lst.iterator();

		while (itr.hasNext()) {
			Transaction transaction = HibernateUtil.getTransaction(session);

			Question question = itr.next();

			session.save(question);
			
			transaction.commit();

		}

		HibernateUtil.CloseSessionAndSessionFactory(session, factory);

	}

}
