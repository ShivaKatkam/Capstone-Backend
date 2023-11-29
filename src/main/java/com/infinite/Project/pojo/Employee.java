package com.infinite.Project.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {

	// Pojo class for employee

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int emp_id;

	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "department")
	private String department;

	@Column(name = "designation")
	private String designation;

	@Column(name = "last_login")
	private String last_login;

	// Constructors for employee

	public Employee() {
		super();
	}

	public Employee(int emp_id, String password) {
		this.emp_id = emp_id;
		this.password = password;
	}

	public Employee(int emp_id, String emp_name, String email) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.email = email;
	}

	public Employee(int emp_id, String emp_name, String email, String password, String department, String designation,
			String last_login) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.email = email;
		this.password = password;
		this.department = department;
		this.designation = designation;
		this.last_login = last_login;
	}

	// Getters and Setters

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

}
