package com.school.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Employee_Admin_Details")
public class Emloyee_Admin_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Emp_Admin_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int emp_Admin_Id;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Emp_Id", name = "fk_clm_Emp_Admin_Id", columnDefinition = "bigint(10) unsigned not null")
	private Employee_Details emp_Admin_emp_Details;

	@Column(name = "clm_Emp_Admin_Last_Salary", columnDefinition = "float(13,2) default 0")
	private float emp_Admin_Last_Salary;

	@Column(name = "clm_Emp_Admin_Current_Salary", columnDefinition = "float(13,2) default 0")
	private float emp_Admin_Current_Salary;

	@Column(name = "clm_Emp_Admin_Last_Rating", columnDefinition = "int(4) default 0")
	private int emp_Admin_Last_Rating;

	@Column(name = "clm_Emp_Admin_Rating", columnDefinition = "int(4) default 0")
	private int emp_Admin_Rating;

	@Column(name = "clm_Emp_Admin_Advanced_Amount", columnDefinition = "float(13,2) default 0")
	private float emp_Admin_Advanced_Amount;

	@Column(name = "clm_Emp_Admin_Transport_Fee", columnDefinition = "float(13,2) default 0")
	private float emp_Admin_Transport_Fee;

	@Column(name = "clm_Emp_Admin_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date emp_Admin_Created_Date;

	@Column(name = "clm_Emp_Admin_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date emp_Admin_Updated_Date;

	public int getEmp_Admin_Id() {
		return emp_Admin_Id;
	}

	public void setEmp_Admin_Id(int emp_Admin_Id) {
		this.emp_Admin_Id = emp_Admin_Id;
	}

	public Employee_Details getEmp_Admin_emp_Details() {
		return emp_Admin_emp_Details;
	}

	public void setEmp_Admin_emp_Details(Employee_Details emp_Admin_emp_Details) {
		this.emp_Admin_emp_Details = emp_Admin_emp_Details;
	}

	public float getEmp_Admin_Last_Salary() {
		return emp_Admin_Last_Salary;
	}

	public void setEmp_Admin_Last_Salary(float emp_Admin_Last_Salary) {
		this.emp_Admin_Last_Salary = emp_Admin_Last_Salary;
	}

	public float getEmp_Admin_Current_Salary() {
		return emp_Admin_Current_Salary;
	}

	public void setEmp_Admin_Current_Salary(float emp_Admin_Current_Salary) {
		this.emp_Admin_Current_Salary = emp_Admin_Current_Salary;
	}

	public int getEmp_Admin_Last_Rating() {
		return emp_Admin_Last_Rating;
	}

	public void setEmp_Admin_Last_Rating(int emp_Admin_Last_Rating) {
		this.emp_Admin_Last_Rating = emp_Admin_Last_Rating;
	}

	public int getEmp_Admin_Rating() {
		return emp_Admin_Rating;
	}

	public void setEmp_Admin_Rating(int emp_Admin_Rating) {
		this.emp_Admin_Rating = emp_Admin_Rating;
	}

	public float getEmp_Admin_Advanced_Amount() {
		return emp_Admin_Advanced_Amount;
	}

	public void setEmp_Admin_Advanced_Amount(float emp_Admin_Advanced_Amount) {
		this.emp_Admin_Advanced_Amount = emp_Admin_Advanced_Amount;
	}

	public float getEmp_Admin_Transport_Fee() {
		return emp_Admin_Transport_Fee;
	}

	public void setEmp_Admin_Transport_Fee(float emp_Admin_Transport_Fee) {
		this.emp_Admin_Transport_Fee = emp_Admin_Transport_Fee;
	}

	public Date getEmp_Admin_Created_Date() {
		return emp_Admin_Created_Date;
	}

	public void setEmp_Admin_Created_Date(Date emp_Admin_Created_Date) {
		this.emp_Admin_Created_Date = emp_Admin_Created_Date;
	}

	public Date getEmp_Admin_Updated_Date() {
		return emp_Admin_Updated_Date;
	}

	public void setEmp_Admin_Updated_Date(Date emp_Admin_Updated_Date) {
		this.emp_Admin_Updated_Date = emp_Admin_Updated_Date;
	}

}
