package com.springhrms.web.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springhrms.model.Employee;
import com.springhrms.model.Job;
import com.springhrms.service.EmployeeService;
import com.springhrms.service.JobService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	private static final String VIEWS_EMPLOYEE_CREATE_FORM = "addEmployee";
	private static final String VIEWS_EMPLOYEE_LIST_VIEW = "listEmployee";

	@Autowired
	EmployeeService employeeService;

	@Autowired
	JobService jobService;

	@Autowired
	private MessageSource messageSource;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@ModelAttribute("jobs")
	public List<Job> populateJobTypes() {
		return jobService.getAllJobs();
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public ModelAndView listEmployee() {
		ModelAndView mav = new ModelAndView(VIEWS_EMPLOYEE_LIST_VIEW);
		List<Employee> allEmployee = employeeService.getAllEmployees();
		mav.addObject("employees", allEmployee);
		return mav;
	}

	@RequestMapping(value = { "/add" }, method = RequestMethod.GET)
	public ModelAndView createEmployee() {
		ModelAndView mav = new ModelAndView(VIEWS_EMPLOYEE_CREATE_FORM);
		Employee employee = new Employee();
		mav.addObject("employee", employee);
		return mav;
	}

	@RequestMapping(value = { "/save" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return VIEWS_EMPLOYEE_CREATE_FORM;
		}
		employeeService.createEmployee(employee);
		redirectAttributes.addFlashAttribute("message",
				messageSource.getMessage("operationMessage.employeeAddSuccess", new String[] {}, Locale.US));
		return "redirect:/employee/list";
	}

}
