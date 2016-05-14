package com.springhrms.service.impl;

import com.springhrms.dao.EmployeeDAO;
import com.springhrms.model.Employee;
import com.springhrms.service.EmployeeService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Manish gour
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	@Transactional
	public long createEmployee(Employee employee) {
		return employeeDAO.createEmployee(employee);
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	@Transactional
	public void deleteEmployee(long id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	@Transactional
	public Employee getEmployee(long id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
