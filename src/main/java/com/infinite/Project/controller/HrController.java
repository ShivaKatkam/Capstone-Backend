package com.infinite.Project.controller;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.Project.pojo.Employee;
import com.infinite.Project.pojo.LoginEmp;
import com.infinite.Project.pojo.LoginMessage;
import com.infinite.Project.repository.IEmployeeRepo;
import com.infinite.Project.service.EmployeeServiceEmp;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api")
public class HrController {
	
	private static final Logger logger= Logger.getLogger(HrController.class);
	
	//we are redirecting to service layer
	
	//wiring with the service layer
	@Autowired
	private EmployeeServiceEmp service;
	 
	//function for creating new employee 
	@PostMapping("/newemployee")
	public void newEmployee(@RequestBody Employee emp) {
		BasicConfigurator.configure();
		service.newEmployee(emp);
	}
	
	//function for reading all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		BasicConfigurator.configure();
		return service.allemployees();
	}
	
	//function for reading particular employee 
	@GetMapping("/employee/{id}") 
	public Employee getEmpById(@PathVariable int id) {
		BasicConfigurator.configure();
		return service.findByUseid(id);
	}
	
	//function for deleting the employee
	@DeleteMapping("/employeedelete/{id}") 
	public void deleteEmp(@PathVariable int id) {
		BasicConfigurator.configure();
		service.deleteEmp(id);
	}

}
