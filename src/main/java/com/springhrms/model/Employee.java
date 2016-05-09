package com.springhrms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String name;

	@Column
	private String address;

	@Column
	private String gender;

	@Column
	private String email;

	@Column
	private String mobile;

	@Column
	private String phone;
}