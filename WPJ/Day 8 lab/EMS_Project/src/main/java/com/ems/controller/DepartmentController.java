package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ems.service.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
	//dependency
	@Autowired //field level D.I
	private DepartmentService departmentService;
	/*
	 * Add a request handling method 
	 * URI - /ctx/departments/list
	 * Method - GET
	 * Resp - implicitly List<Department>
	 */
	@GetMapping("/list")
	public String renderDepartmentList(Model map) {
		System.out.println("in dept list"+map);//{}
		map.addAttribute("dept_list", departmentService.getAllDepartments());
		return "depts/list";
	}
	/*
	 * Handler rets explicitly - LVN & implicitly List<Dept> -> D.S
	 * D.S -> sends LVN -> V.R -> AVN (/WEB-INF/views/depts/list.jsp) -> D.S
	 * D.S -> adds model attributes under request scope -> forward
	 * -> JSP : renders it
	 */
	

}
