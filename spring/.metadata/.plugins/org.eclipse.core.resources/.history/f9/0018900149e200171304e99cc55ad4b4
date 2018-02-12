package com.psl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

//http://localhost:8080/SpringMVC/home

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String showHomePage(Model model) {
		System.out.println("in employee controller.showHomePage()");
		model.addAttribute("message", "hello world!");
		model.addAttribute("employee", new Employee());
		List<Employee> list = service.getAllEmployees();
		model.addAttribute("list", list);
		return "home";
	}

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.POST)
	public String register(Model model,
			@Valid @ModelAttribute Employee employee, BindingResult result) {
		System.out.println("Employee Registered " + employee);
		// model.addAttribute("message", "hello world!");
		// model.addAttribute("employee", new Employee());

		if (result.hasErrors())
			return "home";
		

		service.createEmployee(employee);

		return "redirect:/home";
	}

	@RequestMapping(value = "/{empName}", method = RequestMethod.GET)
	public String showEmpPage(Model model, @PathVariable String empName,
			@RequestParam(required = false) String dept) {
		System.out.println("in employee controller.showHomePage() i clicked "
				+ empName);
		model.addAttribute("empName", empName);
		model.addAttribute("dept", dept);
		// System.out.println(dept);
		model.addAttribute("message", "hello " + empName);
		return "emp";
	}
}
