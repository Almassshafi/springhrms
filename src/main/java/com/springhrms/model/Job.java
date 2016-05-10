package com.springhrms.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "jobs")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "job_id")
	private int jobId;

	@Column(name = "job_title")
	private String jobTitle;

	@Column(name = "min_salary")
	private double minSalary;

	@Column(name = "max_salary")
	private double maxSalary;

	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	private Set<Employee> employees;

	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	private Set<JobHistory> jobhistories;
}
