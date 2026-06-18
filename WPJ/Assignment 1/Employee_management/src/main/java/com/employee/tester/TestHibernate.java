package com.employee.tester;

import static com.employee.utils.HibernateUtils.getFactory;

import org.hibernate.*;

public class TestHibernate {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()) {
			System.out.println("Hibernate Up and Running!");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}

}
