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
@Table(name = "TBL_Student_Details")
public class Student_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Stu_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int stu_Id;

	@Column(name = "clm_Stu_First_Name", columnDefinition = "varchar(50) default null")
	private String stu_First_Name;

	@Column(name = "clm_Stu_Last_Name", columnDefinition = "varchar(50) default null")
	private String stu_Last_Name;

	@Column(name = "clm_Stu_Father_Name", columnDefinition = "varchar(50) default null")
	private String stu_Father_Name;

	@Column(name = "clm_Stu_Gender", columnDefinition = "varchar(1) default 'M'")
	private char stu_Gender;

	@Column(name = "clm_Stu_Age", columnDefinition = "int(3) default 0")
	private int stu_Age;

	@Column(name = "clm_Stu_Mobile_Number", columnDefinition = "bigint(10) unsigned not null default 0")
	private long stu_Mobile_Number;

	@Column(name = "clm_Stu_Email", columnDefinition = "varchar(50) default null")
	private String stu_Email;

	@Column(name = "clm_Stu_DOB", columnDefinition = "varchar(20) default null")
	private String stu_DOB;

	@Column(name = "clm_Stu_DOJ", columnDefinition = "varchar(20) default null")
	private String stu_DOJ;

	@Column(name = "clm_Profile_Pic", columnDefinition = "varchar(50) default 'default.jgp'")
	private String stu_Profile_Pic;

	@Column(name = "clm_Stu_Active", columnDefinition = "bit(1) default 0")
	private boolean stu_Is_Active;

	@Column(name = "clm_Stu_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date stu_Created_Date;

	@Column(name = "clm_Stu_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date stu_Updated_Date;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Class_Id", name = "fk_clm_Stu_Class_Joined_Id", columnDefinition = "bigint(10) unsigned not null")
	private Class_List stu_Class_Joined;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Class_Id", name = "fk_clm_Stu_Class_Now_Id", columnDefinition = "bigint(10) unsigned not null")
	private Class_List stu_Class_Now;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Emp_Id", name = "fk_clm_Stu_Staff_Id", columnDefinition = "bigint(10) unsigned not null")
	private Employee_Details stu_Class_Staff;

	public int getStu_Id() {
		return stu_Id;
	}

	public void setStu_Id(int stu_Id) {
		this.stu_Id = stu_Id;
	}

	public String getStu_First_Name() {
		return stu_First_Name;
	}

	public void setStu_First_Name(String stu_First_Name) {
		this.stu_First_Name = stu_First_Name;
	}

	public String getStu_Last_Name() {
		return stu_Last_Name;
	}

	public void setStu_Last_Name(String stu_Last_Name) {
		this.stu_Last_Name = stu_Last_Name;
	}

	public String getStu_Father_Name() {
		return stu_Father_Name;
	}

	public void setStu_Father_Name(String stu_Father_Name) {
		this.stu_Father_Name = stu_Father_Name;
	}

	public char getStu_Gender() {
		return stu_Gender;
	}

	public void setStu_Gender(char stu_Gender) {
		this.stu_Gender = stu_Gender;
	}

	public int getStu_Age() {
		return stu_Age;
	}

	public void setStu_Age(int stu_Age) {
		this.stu_Age = stu_Age;
	}

	public long getStu_Mobile_Number() {
		return stu_Mobile_Number;
	}

	public void setStu_Mobile_Number(long stu_Mobile_Number) {
		this.stu_Mobile_Number = stu_Mobile_Number;
	}

	public String getStu_Email() {
		return stu_Email;
	}

	public void setStu_Email(String stu_Email) {
		this.stu_Email = stu_Email;
	}

	public String getStu_DOB() {
		return stu_DOB;
	}

	public void setStu_DOB(String stu_DOB) {
		this.stu_DOB = stu_DOB;
	}

	public String getStu_DOJ() {
		return stu_DOJ;
	}

	public void setStu_DOJ(String stu_DOJ) {
		this.stu_DOJ = stu_DOJ;
	}

	public String getStu_Profile_Pic() {
		return stu_Profile_Pic;
	}

	public void setStu_Profile_Pic(String stu_Profile_Pic) {
		this.stu_Profile_Pic = stu_Profile_Pic;
	}

	public boolean isStu_Is_Active() {
		return stu_Is_Active;
	}

	public void setStu_Is_Active(boolean stu_Is_Active) {
		this.stu_Is_Active = stu_Is_Active;
	}

	public Date getStu_Created_Date() {
		return stu_Created_Date;
	}

	public void setStu_Created_Date(Date stu_Created_Date) {
		this.stu_Created_Date = stu_Created_Date;
	}

	public Date getStu_Updated_Date() {
		return stu_Updated_Date;
	}

	public void setStu_Updated_Date(Date stu_Updated_Date) {
		this.stu_Updated_Date = stu_Updated_Date;
	}

	public Class_List getStu_Class_Joined() {
		return stu_Class_Joined;
	}

	public void setStu_Class_Joined(Class_List stu_Class_Joined) {
		this.stu_Class_Joined = stu_Class_Joined;
	}

	public Class_List getStu_Class_Now() {
		return stu_Class_Now;
	}

	public void setStu_Class_Now(Class_List stu_Class_Now) {
		this.stu_Class_Now = stu_Class_Now;
	}

	public Employee_Details getStu_Class_Staff() {
		return stu_Class_Staff;
	}

	public void setStu_Class_Staff(Employee_Details stu_Class_Staff) {
		this.stu_Class_Staff = stu_Class_Staff;
	}

}
