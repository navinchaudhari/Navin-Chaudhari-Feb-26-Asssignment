package com.employee.tester;

import static com.employee.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.entities.Employee;

public class AddEmployeeTester {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner scanner = new Scanner(System.in);) {
			System.out.println("dept id , emp details (email , password , name , salary,join date)");

			EmployeeDao dao = new EmployeeDaoImpl();
			Employee employee = new Employee();

			int deptId = scanner.nextInt();

			employee.setEmail(scanner.next());
			employee.setPassword(scanner.next());
			employee.setName(scanner.next());
			employee.setSalary(scanner.nextDouble());
			employee.setJoinDate(LocalDate.parse(scanner.next()));

			System.out.println(dao.addEmpInDepart(employee, deptId));

		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}

}
