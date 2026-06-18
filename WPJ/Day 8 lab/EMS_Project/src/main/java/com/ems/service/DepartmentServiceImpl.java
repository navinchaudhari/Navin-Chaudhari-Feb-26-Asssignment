package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ems.entities.Department;
import com.ems.repository.DepartmentRepository;

@Service // to declare a spring bean containing B.L
@Transactional // imported from o.s
public class DepartmentServiceImpl implements DepartmentService {
	// dependency
	@Autowired // matching by data type
	private DepartmentRepository departmentRepo;

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepo.findAll();
	}

}
