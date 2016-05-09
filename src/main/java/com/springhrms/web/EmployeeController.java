package com.springhrms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping()
	public String index() {
		return "EmployeeIndex";
	}
}
