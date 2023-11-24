package com.infinite.Project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.Project.controller.HrController;
import com.infinite.Project.pojo.Employee;
import com.infinite.Project.repository.EmployeeRepoImpl;
import com.infinite.Project.repository.IEmployeeRepo;

@Service
public class EmployeeServiceEmp implements IEmployeeService {
	
	private static final Logger logger= Logger.getLogger(EmployeeServiceEmp.class);
	
	//implementation for employee interface
	
	//wiring for the repository layer
	
	@Autowired
	private EmployeeRepoImpl emprepo;
	
	//logic for employee functions
	
	//redirecting to the repository layer
	
	@Transactional
	@Override
	public String findByUseidandPassword(int empid, String password) {
		
		//redirecting to the repository layer
		
		BasicConfigurator.configure();
		return emprepo.findByUseidandPassword(empid, password);
	}
	
	@Transactional
	@Override
	public void newEmployee(Employee emp) {
		
		//redirecting to the repository layer
		BasicConfigurator.configure();
		emprepo.newEmployee(emp);
	}
	
	@Transactional
	@Override
	public List<Employee> allemployees() {
		
		//redirecting to the repository layer
		BasicConfigurator.configure();
		return emprepo.allemployees();
	}
	
	@Transactional
	@Override
	public Employee findByUseid(int empid) {
		
		//redirecting to the repository layer
		BasicConfigurator.configure();
		return emprepo.findByUseid(empid);
	}
	
	@Transactional
	@Override
	public void deleteEmp(int empid) {
		
		//redirecting to the repository layer
		BasicConfigurator.configure();
		emprepo.deleteEmp(empid);
	}

}
