package com.infinite.Project.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.Project.HikaryDataBase;
import com.infinite.Project.controller.HrController;
import com.infinite.Project.pojo.Employee;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo {
	
	private static final Logger logger= Logger.getLogger(EmployeeRepoImpl.class);

	//repository layer for database operations
	
	//function for validating the credentials
	@Override
	public String findByUseidandPassword(int empid, String password) {
		
		BasicConfigurator.configure();
		
		Connection con = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			//handing exceptions
			
			//creating database connection
			DataSource datasource = HikaryDataBase.getDatasource();
			con = datasource.getConnection();
			
			//query for validation
			pt = con.prepareStatement("select * from employee_table where emp_id=? and password=?;");
			pt.setInt(1, empid);
			pt.setString(2, password);
			
			//executing the query
			rs = pt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(5));
				
				//validating login is hr or employee
				if (rs.getString(5).matches("hr") ){
					return "hr";
				} else if (rs.getString(5).matches("emp") ){
					return "emp";
				}
			}
		} catch (Exception e) {
			//printing the exception if occured
			System.out.println(e.getCause());
		}
		
		//returning false if credentials fails
		return "false";
	}

	@Override
	public void newEmployee(Employee emp) {
		//function for employee creation
		
	}

	@Override
	public List<Employee> allemployees() {
		
		// function for reading employees
		
		List<Employee> ls = null;
		return ls;
	}

	@Override
	public Employee findByUseid(int empid) {
		
		//function for reading employee details
		
		Employee emp = null;
		return emp;
	}

	@Override
	public void deleteEmp(int empid) {
		
		//function for deleting the employee
		
	}

}
