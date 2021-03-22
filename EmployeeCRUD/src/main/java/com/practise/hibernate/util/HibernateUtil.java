package com.practise.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	public static SessionFactory getSessionFactory()
	{
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		return factory;
	}
	
	public static Session getSession(SessionFactory factory)
	{
		Session session = factory.openSession();
		
		return session;
	}
	
	public static void closeSessionFactoryAndSession(SessionFactory factory, Session session)
	{
		session.close();
		factory.close();
	}

}
