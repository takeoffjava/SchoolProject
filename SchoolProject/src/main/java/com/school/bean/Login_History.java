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
@Table(name = "TBL_Login_History")
public class Login_History {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Login_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int emp_Login_Id;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Emp_Id", name = "fk_clm_Emp_Login_Id", columnDefinition = "bigint(10) unsigned not null")
	private Employee_Details emp_Login_emp_Details;

	@Column(name = "clm_Emp_Loggedin_Time", columnDefinition = "timestamp default now()", nullable = true)
	private Date emp_LoggedIn_Time;

	@Column(name = "clm_Emp_LoggedOut_Time", columnDefinition = "timestamp null default null", nullable = true)
	private Date emp_LoggedOut_Time;

	public int getEmp_Login_Id() {
		return emp_Login_Id;
	}

	public void setEmp_Login_Id(int emp_Login_Id) {
		this.emp_Login_Id = emp_Login_Id;
	}

	public Employee_Details getEmp_Login_emp_Details() {
		return emp_Login_emp_Details;
	}

	public void setEmp_Login_emp_Details(Employee_Details emp_Login_emp_Details) {
		this.emp_Login_emp_Details = emp_Login_emp_Details;
	}

	public Date getEmp_LoggedIn_Time() {
		return emp_LoggedIn_Time;
	}

	public void setEmp_LoggedIn_Time(Date emp_LoggedIn_Time) {
		this.emp_LoggedIn_Time = emp_LoggedIn_Time;
	}

	public Date getEmp_LoggedOut_Time() {
		return emp_LoggedOut_Time;
	}

	public void setEmp_LoggedOut_Time(Date emp_LoggedOut_Time) {
		this.emp_LoggedOut_Time = emp_LoggedOut_Time;
	}

}
