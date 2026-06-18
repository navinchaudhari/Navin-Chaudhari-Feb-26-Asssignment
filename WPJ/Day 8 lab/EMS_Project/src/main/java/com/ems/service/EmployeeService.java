package com.ems.service;

import java.util.List;

import com.ems.entities.Employee;

public interface EmployeeService {
	List<Employee> getEmployeesByDepartmentId(Long deptId);
}
