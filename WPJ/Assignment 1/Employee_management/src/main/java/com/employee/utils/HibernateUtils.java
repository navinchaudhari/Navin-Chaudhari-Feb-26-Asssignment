package com.employee.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory sessionFactory;

	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getFactory() {
		return sessionFactory;
	}

}
