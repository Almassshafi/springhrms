package com.springhrms.web;

import com.springhrms.model.Employee;
import com.springhrms.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
