package com.springhrms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springhrms.model.Employee;
import com.springhrms.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping()
    public String index() {
        List<Employee> allEmployee = employeeService.getAllEmployees();
        System.out.println(allEmployee);
        return "EmployeeIndex";
    }
}
