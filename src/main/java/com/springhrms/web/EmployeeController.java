package com.springhrms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springhrms.model.Employee;
import com.springhrms.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping()
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("EmployeeIndex");
		List<Employee> allEmployee = employeeService.getAllEmployees();
		mav.addObject("employees", allEmployee);
		return mav;
	}

	@RequestMapping(value = { "/add" }, method = RequestMethod.GET)
	public ModelAndView createEmployee() {
		ModelAndView mav = new ModelAndView("AddEmployee");
		return mav;
	}
}
