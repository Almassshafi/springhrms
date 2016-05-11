package com.springhrms.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private long employeeId;

	@OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)
	private Set<Department> departments;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "manager_id", nullable = true)
	private Employee manager;

	@OneToMany(mappedBy = "manager")
	private Set<Employee> subordinates = new HashSet<Employee>();

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "hire_date")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date hireDate;

	@Column(name = "salary", columnDefinition = "Decimal(10,2) default '100.00'")
	private double salary;

	@Column(name = "commission_pct", columnDefinition = "Decimal(10,2) default '100.00'")
	private double commissionPct;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private JobHistory jobHistory;

	@Override
	public String toString() {
		return "id=" + employeeId + ", name=" + firstName + " " + lastName + ", email=" + email;
	}
}