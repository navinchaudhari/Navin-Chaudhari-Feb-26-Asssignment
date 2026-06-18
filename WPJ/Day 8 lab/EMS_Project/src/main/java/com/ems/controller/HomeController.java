package com.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * To declare a spring bean containing 
 * - request handling logic
 * - singleton & eager
 */
@Controller 
public class HomeController {
	public HomeController() {
		System.out.println("in constr "+getClass());
	}
	/*
	 * Request Handling method
	 * URI - /
	 * Method - GET
	 *Resp  - render welcome mesg 
	 *Handler Mapping 
	 *Key - GET /
	 *Value - com.ems.controller.HelloWorldController.renderHomePage
	 */
	@GetMapping("/") //doGet
	public String renderHomePage() {
		System.out.println("in render home page ....");
		return "home";
	}

}
