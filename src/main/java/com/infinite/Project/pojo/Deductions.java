package com.infinite.Project.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="deduction_table")
public class Deductions {
	
	//Pojo class for Deductions
	
	@ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
	
	@Column(name="type_of_deduction")
	private String type_of_deduction;
	
	@Column(name="deduction_amount")
	private int deduction_amount;
	
	//Getters and Setters

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getType_of_deduction() {
		return type_of_deduction;
	}

	public void setType_of_deduction(String type_of_deduction) {
		this.type_of_deduction = type_of_deduction;
	}

	public int getDeduction_amount() {
		return deduction_amount;
	}

	public void setDeduction_amount(int deduction_amount) {
		this.deduction_amount = deduction_amount;
	}
	
	
}
