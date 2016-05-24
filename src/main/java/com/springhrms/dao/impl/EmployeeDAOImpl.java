package com.springhrms.dao.impl;

import com.springhrms.dao.EmployeeDAO;
import com.springhrms.model.Employee;

import java.util.List;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long createEmployee(Employee employee) {
		Long newKey = (Long) sessionFactory.getCurrentSession().save(employee);
		logger.info("EmployeeDAOImpl createEmployee method executed");
		return newKey.longValue();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		logger.info("EmployeeDAOImpl updateEmployee method executed");
		return employee;
	}

	@Override
	public void deleteEmployee(long employeeId) {
		logger.info("EmployeeDAOImpl deleteEmployee method executed");
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Employee WHERE employeeId = " + employeeId)
				.executeUpdate();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		logger.info("EmployeeDAOImpl getAllEmployees method executed");
		return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	@Override
	public Employee getEmployee(long employeeId) {
		logger.info("EmployeeDAOImpl getEmployee method executed");
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
	}

}
