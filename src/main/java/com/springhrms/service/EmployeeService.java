package com.springhrms.service;

import com.springhrms.model.Employee;
import java.util.List;

import org.springframework.security.access.annotation.Secured;

/**
 *
 * @author Manish gour
 */
public interface EmployeeService {

	@Secured("ROLE_ADMIN")
    public long createEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long employeeId);

    public List<Employee> getAllEmployees();

    public Employee getEmployee(long employeeId);

}
