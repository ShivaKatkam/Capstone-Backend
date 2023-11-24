package com.infinite.Project.repository;

import java.util.List;

import com.infinite.Project.pojo.Employee;

public interface IEmployeeRepo {
	
	//interface for employee repository
	
	//functions for employee 
	public String findByUseidandPassword(int empid,String password);
	
	public void newEmployee(Employee emp);
	
	public List<Employee> allemployees();
	
	public Employee findByUseid(int empid);
	
	public void deleteEmp(int empid);

}
