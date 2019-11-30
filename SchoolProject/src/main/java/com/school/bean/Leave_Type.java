package com.school.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Leave_Type")
public class Leave_Type {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Leave_Type_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int leave_Type_Id;

	@Column(name = "clm_Leave_Type", columnDefinition = "varchar(50) default null")
	private String leave_Type;

	@Column(name = "clm_Leave_Active", columnDefinition = "bit(1) default 0")
	private boolean leave_Is_Active;

	@Column(name = "clm_Leave_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date leave_Created_Date;

	@Column(name = "clm_Leave_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date emp_Leave_Date;

	public int getLeave_Type_Id() {
		return leave_Type_Id;
	}

	public void setLeave_Type_Id(int leave_Type_Id) {
		this.leave_Type_Id = leave_Type_Id;
	}

	public String getLeave_Type() {
		return leave_Type;
	}

	public void setLeave_Type(String leave_Type) {
		this.leave_Type = leave_Type;
	}

	public boolean isLeave_Is_Active() {
		return leave_Is_Active;
	}

	public void setLeave_Is_Active(boolean leave_Is_Active) {
		this.leave_Is_Active = leave_Is_Active;
	}

	public Date getLeave_Created_Date() {
		return leave_Created_Date;
	}

	public void setLeave_Created_Date(Date leave_Created_Date) {
		this.leave_Created_Date = leave_Created_Date;
	}

	public Date getEmp_Leave_Date() {
		return emp_Leave_Date;
	}

	public void setEmp_Leave_Date(Date emp_Leave_Date) {
		this.emp_Leave_Date = emp_Leave_Date;
	}

}
