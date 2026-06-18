package com.employee.dao;

import com.employee.entities.Department;

import static com.employee.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public String addDepartment(Department department) {

		String msg = "Failed";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			session.persist(department);
			msg = "Success";
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
				throw e;
			}
		}
		return msg;
	}

}
