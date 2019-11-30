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
@Table(name = "TBL_Emloyee_Details")
public class Employee_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Emp_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int emp_Id;

	@Column(name = "clm_Emp_First_Name", columnDefinition = "varchar(50) default null")
	private String emp_First_Name;

	@Column(name = "clm_Emp_Last_Name", columnDefinition = "varchar(50) default null")
	private String emp_Last_Name;

	@Column(name = "clm_Emp_FatherorHusband_Name", columnDefinition = "varchar(50) default null")
	private String emp_FatherorHusband_Name;

	@Column(name = "clm_Emp_Gender", columnDefinition = "varchar(1) default 'M'")
	private char emp_Gender;

	@Column(name = "clm_Emp_Age", columnDefinition = "int(3) default 0")
	private int emp_Age;

	@Column(name = "clm_Emp_Mobile_Number", columnDefinition = "bigint(10) unsigned not null default 0")
	private long emp_Mobile_Number;

	@Column(name = "clm_Emp_Email", columnDefinition = "varchar(50) default null")
	private String emp_Email;

	@Column(name = "clm_Emp_DOB", columnDefinition = "varchar(20) default null")
	private String emp_DOB;

	@Column(name = "clm_Emp_DOJ", columnDefinition = "varchar(20) default null")
	private String emp_DOJ;

	@Column(name = "clm_Emp_Experience", columnDefinition = "smallint(4) default 0")
	private int emp_Experience;

	@Column(name = "clm_Profile_Pic", columnDefinition = "varchar(50) default 'default.jpg'")
	private String emp_Profile_Pic;

	@Column(name = "clm_Emp_Active", columnDefinition = "bit(1) default 0")
	private boolean emp_Is_Active;

	@Column(name = "clm_Emp_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date emp_Created_Date;

	@Column(name = "clm_Emp_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date emp_Updated_Date;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Graduate_Id", name = "fk_clm_Graduate_Id", columnDefinition = "bigint(10) unsigned not null")
	private Graduate_List emp_Graduate_List;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Job_Id", name = "fk_clm_Job_Id", columnDefinition = "bigint(10) unsigned not null")
	private Job_Role emp_Job_Role;

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_First_Name() {
		return emp_First_Name;
	}

	public void setEmp_First_Name(String emp_First_Name) {
		this.emp_First_Name = emp_First_Name;
	}

	public String getEmp_Last_Name() {
		return emp_Last_Name;
	}

	public void setEmp_Last_Name(String emp_Last_Name) {
		this.emp_Last_Name = emp_Last_Name;
	}

	public String getEmp_FatherorHusband_Name() {
		return emp_FatherorHusband_Name;
	}

	public void setEmp_FatherorHusband_Name(String emp_FatherorHusband_Name) {
		this.emp_FatherorHusband_Name = emp_FatherorHusband_Name;
	}

	public char getEmp_Gender() {
		return emp_Gender;
	}

	public void setEmp_Gender(char emp_Gender) {
		this.emp_Gender = emp_Gender;
	}

	public int getEmp_Age() {
		return emp_Age;
	}

	public void setEmp_Age(int emp_Age) {
		this.emp_Age = emp_Age;
	}

	public long getEmp_Mobile_Number() {
		return emp_Mobile_Number;
	}

	public void setEmp_Mobile_Number(long emp_Mobile_Number) {
		this.emp_Mobile_Number = emp_Mobile_Number;
	}

	public String getEmp_Email() {
		return emp_Email;
	}

	public void setEmp_Email(String emp_Email) {
		this.emp_Email = emp_Email;
	}

	public String getEmp_DOB() {
		return emp_DOB;
	}

	public void setEmp_DOB(String emp_DOB) {
		this.emp_DOB = emp_DOB;
	}

	public String getEmp_DOJ() {
		return emp_DOJ;
	}

	public void setEmp_DOJ(String emp_DOJ) {
		this.emp_DOJ = emp_DOJ;
	}

	public int getEmp_Experience() {
		return emp_Experience;
	}

	public void setEmp_Experience(int emp_Experience) {
		this.emp_Experience = emp_Experience;
	}

	public String getEmp_Profile_Pic() {
		return emp_Profile_Pic;
	}

	public void setEmp_Profile_Pic(String emp_Profile_Pic) {
		this.emp_Profile_Pic = emp_Profile_Pic;
	}

	public boolean isEmp_Is_Active() {
		return emp_Is_Active;
	}

	public void setEmp_Is_Active(boolean emp_Is_Active) {
		this.emp_Is_Active = emp_Is_Active;
	}

	public Date getEmp_Created_Date() {
		return emp_Created_Date;
	}

	public void setEmp_Created_Date(Date emp_Created_Date) {
		this.emp_Created_Date = emp_Created_Date;
	}

	public Date getEmp_Updated_Date() {
		return emp_Updated_Date;
	}

	public void setEmp_Updated_Date(Date emp_Updated_Date) {
		this.emp_Updated_Date = emp_Updated_Date;
	}

	public Graduate_List getEmp_Graduate_List() {
		return emp_Graduate_List;
	}

	public void setEmp_Graduate_List(Graduate_List emp_Graduate_List) {
		this.emp_Graduate_List = emp_Graduate_List;
	}

	public Job_Role getEmp_Job_Role() {
		return emp_Job_Role;
	}

	public void setEmp_Job_Role(Job_Role emp_Job_Role) {
		this.emp_Job_Role = emp_Job_Role;
	}

}
