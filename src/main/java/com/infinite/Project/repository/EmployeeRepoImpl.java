package com.infinite.Project.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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

	private static final Logger logger = Logger.getLogger(EmployeeRepoImpl.class);

	// repository layer for database operations

	// function for validating the credentials
	@Override
	public String findByUseidandPassword(int empid, String password) {

		BasicConfigurator.configure();

		Connection con = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			// handing exceptions

			// creating database connection
			DataSource datasource = HikaryDataBase.getDatasource();
			con = datasource.getConnection();

			// query for validation
			pt = con.prepareStatement("select * from employee_table where emp_id=? and password=?;");
			pt.setInt(1, empid);
			pt.setString(2, password);

			// executing the query
			rs = pt.executeQuery();
			while (rs.next()) {
				
				// validating login is hr or employee
				return rs.getString(5);
			}
		} catch (Exception e) {
			// printing the exception if occured
			logger.error(e.getCause());
		}

		// returning false if credentials fails
		return "false";
	}

	@Override
	public void newEmployee(Employee emp) {
		// function for employee creation
		BasicConfigurator.configure();

		Connection con = null;
		PreparedStatement pt = null;
		int rs = 0;

		try {
			// handing exceptions

			// creating database connection
			DataSource datasource = HikaryDataBase.getDatasource();
			con = datasource.getConnection();

			pt = con.prepareStatement("insert into employee_table values(?,?,?,?,?,?,?);");
			pt.setInt(1, emp.getEmp_id());
			pt.setString(2, emp.getEmp_name());
			pt.setString(3, emp.getEmail());
			pt.setString(4, "1234");
			pt.setString(5, emp.getDepartment());
			pt.setString(6, emp.getDesignation());
			pt.setString(7, "2023");

			// executing the query
			rs = pt.executeUpdate();

		} catch (Exception e) {
			// printing the exception if occured
			logger.error(e.getCause());
		}
	}

	@Override
	public List<Employee> allemployees() {

		// function for reading employees

		List<Employee> ls = new ArrayList<Employee>();

		Connection con = null;
		PreparedStatement pt = null;
		ResultSet rs = null;

		try {
			// handing exceptions

			// creating database connection
			DataSource datasource = HikaryDataBase.getDatasource();
			con = datasource.getConnection();

			// query for validation
			pt = con.prepareStatement("select * from employee_table;");
			rs = pt.executeQuery();
			while (rs.next()) {
				//checking other than hr
				if (!rs.getString(5).matches("hr")) {
					Employee emp = new Employee();
					emp.setEmp_id(rs.getInt(1));
					emp.setEmp_name(rs.getString(2));
					emp.setEmail(rs.getString(3));
					emp.setPassword(rs.getString(4));
					emp.setDepartment(rs.getString(5));
					emp.setDesignation(rs.getString(6));
					emp.setLast_login(rs.getString(7));
					//adding employee class to list
					ls.add(emp);
				}

			}

		} catch (Exception e) {
			// printing the exception if occured
			logger.error(e.getCause());
		}
		return ls;
	}

	@Override
	public Employee findByUseid(int empid) {

		// function for reading employee details

		Employee emp = null;
		return emp;
	}

	@Override
	public void deleteEmp(int empid) {

		// function for deleting the employee

	}

}
