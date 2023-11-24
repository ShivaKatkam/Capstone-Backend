package com.infinite.Project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infinite.Project.pojo.Employee;


public interface IEmployeeService  {
	
	//interface for employee service
	
	//functions for employee
	
	public String findByUseidandPassword(int empid,String password);
	
	public List<Employee> allemployees();
	
	public void newEmployee(Employee emp);
	
	public Employee findByUseid(int empid);
	
	public void deleteEmp(int empid);
	
}
