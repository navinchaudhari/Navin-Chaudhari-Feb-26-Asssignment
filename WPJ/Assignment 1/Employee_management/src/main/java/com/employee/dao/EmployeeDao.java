package com.employee.dao;

import com.employee.entities.Employee;

public interface EmployeeDao {
	
	String addEmpInDepart(Employee employee, Integer deptId);

}
