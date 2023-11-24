package com.infinite.Project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infinite.Project.pojo.Employee;
import com.infinite.Project.pojo.LoginEmp;
import com.infinite.Project.pojo.LoginMessage;
import com.infinite.Project.repository.EmployeeRepoImpl;
import com.infinite.Project.repository.IEmployeeRepo;
import com.infinite.Project.service.EmployeeServiceEmp;

@RestController
@CrossOrigin(origins = "http://localhost:3000/") // Allowing requests from the React frontend
@RequestMapping("/api")
public class LoginController {
	
	private static final Logger logger= Logger.getLogger(LoginController.class);
	
	//we are redirecting to service layer
	
	//wiring with the service layer
	@Autowired
	private EmployeeServiceEmp service;
	
	//function for verifying the login credentials
	@PostMapping(value = "/login")
	public LoginMessage login(@RequestBody LoginEmp empl,HttpServletRequest request) {
		
		BasicConfigurator.configure();
		
		//for session creation if credentials matches
		HttpSession session=null;
		try {
			//calling service layer functions
			String s = service.findByUseidandPassword(empl.getEmp_id(), empl.getPassword());
			
			//verifying the login is hr or employee
			if (s == "hr") {
				//creating session 
				session=request.getSession();
		        session.setAttribute("empid", empl.getEmp_id());
		        session.setAttribute("password", empl.getPassword());
				return new LoginMessage("Hr Login Success", true);
			}
			else if(s=="emp"){
				//creating session 
				session=request.getSession();
		        session.setAttribute("empid", empl.getEmp_id());
		        session.setAttribute("password", empl.getPassword());
				return new LoginMessage("Emp Login Success", true);
			}
		} catch (Exception e) {
			
			//handing the exception
			
			e.printStackTrace();
		}
		
		//returning the message for front end
		return new LoginMessage("Incorrect emailId or Password", false);
	}

}