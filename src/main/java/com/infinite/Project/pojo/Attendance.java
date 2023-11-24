package com.infinite.Project.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="attandance_table")
public class Attendance {
	
	//Pojo class for Attendance
	
	@ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
	
	@Column(name="no_of_leaves")
	private int no_of_leaves;
	
	@Column(name="leaves_taken")
	private int leaves_taken;
	
	@Column(name="month")
	private String month;
	
	@Column(name="year")
	private String year;
	
	//getters and setters

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getNo_of_leaves() {
		return no_of_leaves;
	}

	public void setNo_of_leaves(int no_of_leaves) {
		this.no_of_leaves = no_of_leaves;
	}

	public int getLeaves_taken() {
		return leaves_taken;
	}

	public void setLeaves_taken(int leaves_taken) {
		this.leaves_taken = leaves_taken;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	

}
