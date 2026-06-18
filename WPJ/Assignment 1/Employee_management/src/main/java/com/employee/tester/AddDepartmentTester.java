package com.employee.tester;

import static com.employee.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.employee.dao.DepartmentDao;
import com.employee.dao.DepartmentDaoImpl;
import com.employee.entities.Department;

public class AddDepartmentTester {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner scanner = new Scanner(System.in);) {
			System.out.println("Enter Department Name, location");
			DepartmentDao dao = new DepartmentDaoImpl();
			Department department = new Department();
			department.setName(scanner.next());
			department.setLocation(scanner.next());
			System.out.println(dao.addDepartment(department));
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

}
