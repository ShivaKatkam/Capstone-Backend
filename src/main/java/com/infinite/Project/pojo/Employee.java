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
	
	//Pojo class for employee 

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
	private int department;

	@Column(name = "designation")
	private int designation;

	@Column(name = "last_login")
	private int last_login;
	
	// Constructors for employee
	
	public Employee() {
		super();
	}

	public Employee(int emp_id, String name, String email, String password, int department, int designation,
			int last_login, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.email = email;
		this.password = password;
		this.department = department;
		this.designation = designation;
		this.last_login = last_login;
	}

	public Employee(int emp_id, String password) {
		super();
		this.emp_id = emp_id;
		this.password = password;
	}
	
	//Getters and Setters

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

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public int getLast_login() {
		return last_login;
	}

	public void setLast_login(int last_login) {
		this.last_login = last_login;
	}

}
