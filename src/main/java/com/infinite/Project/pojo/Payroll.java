package com.infinite.Project.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payroll_table")
public class Payroll {
	
	//Pojo class for Payroll 

	@Id
	@Column(name = "pay_id")
	private int pay_id;

	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Attendance attendance;

	@Column(name = "pf_no")
	private int pf_no;

	@Column(name = "salary")
	private int salary;

	@Column(name = "datefrom")
	private int date_from;

	@Column(name = "dateto")
	private int date_to;

	@Column(name = "status")
	private int status;
	
	//setters and getters
	
	public int getPay_id() {
		return pay_id;
	}

	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}

	public Attendance getAttendance() {
		return attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}

	public int getPf_no() {
		return pf_no;
	}

	public void setPf_no(int pf_no) {
		this.pf_no = pf_no;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDate_from() {
		return date_from;
	}

	public void setDate_from(int date_from) {
		this.date_from = date_from;
	}

	public int getDate_to() {
		return date_to;
	}

	public void setDate_to(int date_to) {
		this.date_to = date_to;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

	
}
