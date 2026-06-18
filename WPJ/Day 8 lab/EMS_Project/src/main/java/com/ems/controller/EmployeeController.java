package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ems.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/list")
	public String renderEmployeeByDeptId(@RequestParam Long deptId, Model map) {
		System.out.println("Employee list");
		map.addAttribute("emp_list", employeeService.getEmployeesByDepartmentId(deptId));
		return "emps/list";
	}

}
