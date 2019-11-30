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
@Table(name = "TBL_Leave_Managment")
public class Leave_Managment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Leave_Managment_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int leave_Management_Id;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Leave_Type_Id", name = "fk_clm_Leave_Type_Id", columnDefinition = "bigint(10) unsigned not null")
	private Leave_Type leave_Type_Id;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Emp_Id", name = "fk_clm_Leave_Emp_Id", columnDefinition = "bigint(10) unsigned not null")
	private Employee_Details leave_emp_Details;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Stu_Id", name = "fk_clm_Leave_Stu_Id", columnDefinition = "bigint(10) unsigned not null")
	private Student_Details leave_Stu_Details;

	@Column(name = "clm_Leave_Taken_By", columnDefinition = "varchar(1) default 'S'") // S-Student E-Employee/Staff
	private String leave_Taken_By;

	@Column(name = "clm_Number_Of_Leave", columnDefinition = "int(4) default 0")
	private int leave_Number_Of_Leave;

	@Column(name = "clm_Leave_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date leave_Created_Date;

	@Column(name = "clm_Leave_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date leave_Updated_Date;

	public int getLeave_Management_Id() {
		return leave_Management_Id;
	}

	public void setLeave_Management_Id(int leave_Management_Id) {
		this.leave_Management_Id = leave_Management_Id;
	}

	public Leave_Type getLeave_Type_Id() {
		return leave_Type_Id;
	}

	public void setLeave_Type_Id(Leave_Type leave_Type_Id) {
		this.leave_Type_Id = leave_Type_Id;
	}

	public String getLeave_Taken_By() {
		return leave_Taken_By;
	}

	public void setLeave_Taken_By(String leave_Taken_By) {
		this.leave_Taken_By = leave_Taken_By;
	}

	public int getLeave_Number_Of_Leave() {
		return leave_Number_Of_Leave;
	}

	public void setLeave_Number_Of_Leave(int leave_Number_Of_Leave) {
		this.leave_Number_Of_Leave = leave_Number_Of_Leave;
	}

	public Date getLeave_Created_Date() {
		return leave_Created_Date;
	}

	public void setLeave_Created_Date(Date leave_Created_Date) {
		this.leave_Created_Date = leave_Created_Date;
	}

	public Date getLeave_Updated_Date() {
		return leave_Updated_Date;
	}

	public void setLeave_Updated_Date(Date leave_Updated_Date) {
		this.leave_Updated_Date = leave_Updated_Date;
	}

	public Employee_Details getLeave_emp_Details() {
		return leave_emp_Details;
	}

	public void setLeave_emp_Details(Employee_Details leave_emp_Details) {
		this.leave_emp_Details = leave_emp_Details;
	}

	public Student_Details getLeave_Stu_Details() {
		return leave_Stu_Details;
	}

	public void setLeave_Stu_Details(Student_Details leave_Stu_Details) {
		this.leave_Stu_Details = leave_Stu_Details;
	}

}
