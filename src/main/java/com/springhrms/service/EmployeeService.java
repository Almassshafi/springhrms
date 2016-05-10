package com.springhrms.service;

import com.springhrms.model.Employee;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface EmployeeService {

    public long createEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long id);

    public List<Employee> getAllEmployees();

    public Employee getEmployee(long id);

}
