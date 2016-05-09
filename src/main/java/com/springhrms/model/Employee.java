package com.springhrms.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="employee_id")
	private int employeeId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="email")
	private String email;

	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="hire_date")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date hireDate;
        
	@Column(name="salary")
	private double salary;
	 
	@Column(name="commission_pct")
	private double commissionPct;
}