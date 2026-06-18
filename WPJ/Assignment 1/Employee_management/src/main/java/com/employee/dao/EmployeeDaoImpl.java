package com.employee.dao;

import static com.employee.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.employee.entities.Department;
import com.employee.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String addEmpInDepart(Employee employee, Integer deptId) {
		String msg = "Failed";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			Department department = session.find(Department.class, deptId);
			if (department == null)
				return "Failed: Department is not there";
			employee.setDepartment(department);

			department.getEmployee().add(employee);

			session.persist(department);

			tx.commit();
			msg = "Success";
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
				throw e;
			}
		}

		return msg;
	}

}
