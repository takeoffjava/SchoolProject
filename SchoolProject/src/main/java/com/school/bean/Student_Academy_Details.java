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
@Table(name = "TBL_Student_Academy_Details")
public class Student_Academy_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Stu_Academy_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int stu_Academy_Id;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Stu_Id", name = "fk_clm_Academy_Stu_Id", columnDefinition = "bigint(10) unsigned not null")
	private Student_Details stu_Academy_Stu_Details;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Exam_Id", name = "fk_clm_Academy_Exam_Id", columnDefinition = "bigint(10) unsigned not null")
	private ExamList stu_Academy_ExamDetails;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Sub_Id", name = "fk_clm_Academy_Sub_Id", columnDefinition = "bigint(10) unsigned not null")
	private Subject_List stu_Academy_Sub_Details;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Emp_Id", name = "fk_clm_Academy_Staff_Id", columnDefinition = "bigint(10) unsigned not null")
	private Employee_Details stu_Academy_Staff_Details;

	@Column(name = "clm_Stu_Academy_Mark", columnDefinition = "int(4) default 0")
	private int stu_Academy_Mark;

	@Column(name = "clm_Stu_Academy_Rank", columnDefinition = "int(3) default 0")
	private int stu_Academy_Rank;

	@Column(name = "clm_Stu_Academy_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date stu_Academy_Created_Date;

	@Column(name = "clm_Stu_Academy_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date stu_Academy_Updated_Date;

	public int getStu_Academy_Id() {
		return stu_Academy_Id;
	}

	public void setStu_Academy_Id(int stu_Academy_Id) {
		this.stu_Academy_Id = stu_Academy_Id;
	}

	public Student_Details getStu_Academy_Stu_Details() {
		return stu_Academy_Stu_Details;
	}

	public void setStu_Academy_Stu_Details(Student_Details stu_Academy_Stu_Details) {
		this.stu_Academy_Stu_Details = stu_Academy_Stu_Details;
	}

	public ExamList getStu_Academy_ExamDetails() {
		return stu_Academy_ExamDetails;
	}

	public void setStu_Academy_ExamDetails(ExamList stu_Academy_ExamDetails) {
		this.stu_Academy_ExamDetails = stu_Academy_ExamDetails;
	}

	public Subject_List getStu_Academy_Sub_Details() {
		return stu_Academy_Sub_Details;
	}

	public void setStu_Academy_Sub_Details(Subject_List stu_Academy_Sub_Details) {
		this.stu_Academy_Sub_Details = stu_Academy_Sub_Details;
	}

	public Employee_Details getStu_Academy_Staff_Details() {
		return stu_Academy_Staff_Details;
	}

	public void setStu_Academy_Staff_Details(Employee_Details stu_Academy_Staff_Details) {
		this.stu_Academy_Staff_Details = stu_Academy_Staff_Details;
	}

	public int getStu_Academy_Mark() {
		return stu_Academy_Mark;
	}

	public void setStu_Academy_Mark(int stu_Academy_Mark) {
		this.stu_Academy_Mark = stu_Academy_Mark;
	}

	public int getStu_Academy_Rank() {
		return stu_Academy_Rank;
	}

	public void setStu_Academy_Rank(int stu_Academy_Rank) {
		this.stu_Academy_Rank = stu_Academy_Rank;
	}

	public Date getStu_Academy_Created_Date() {
		return stu_Academy_Created_Date;
	}

	public void setStu_Academy_Created_Date(Date stu_Academy_Created_Date) {
		this.stu_Academy_Created_Date = stu_Academy_Created_Date;
	}

	public Date getStu_Academy_Updated_Date() {
		return stu_Academy_Updated_Date;
	}

	public void setStu_Academy_Updated_Date(Date stu_Academy_Updated_Date) {
		this.stu_Academy_Updated_Date = stu_Academy_Updated_Date;
	}

}
