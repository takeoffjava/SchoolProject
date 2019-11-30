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
@Table(name = "TBL_Student_Admin_Details")
public class Student_Admin_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Stu_Admin_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int stu_Admin_Id;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Stu_Id", name = "fk_clm_Admin_Stu_Id", columnDefinition = "bigint(10) unsigned not null")
	private Student_Details stu_Admin_Stu_Details;

	@OneToOne
	@JoinColumn(referencedColumnName = "clm_Exam_Id", name = "fk_clm_Admin_Exam_Id", columnDefinition = "bigint(10) unsigned not null")
	private ExamList stu_Admin_Exam_List;

	@Column(name = "clm_Stu_Admin_Book_Fee", columnDefinition = "float(13,2) default 0")
	private float stu_Admin_Book_Fee;

	@Column(name = "clm_Stu_Admin_Transport_Fee", columnDefinition = "float(13,2) default 0")
	private float stu_Admin_Transport_Fee;

	@Column(name = "clm_Stu_Admin_Exam_Fee", columnDefinition = "float(13,2) default 0")
	private float stu_Admin_Exam_Fee;

	@Column(name = "clm_Stu_Admin_Fine_Fee", columnDefinition = "float(13,2) default 0")
	private float stu_Admin_Fine_Fee;

	@Column(name = "clm_Stu_Admin_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date stu_Admin_Created_Date;

	@Column(name = "clm_Stu_Admin_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date stu_Admin_Updated_Date;

	public int getStu_Admin_Id() {
		return stu_Admin_Id;
	}

	public void setStu_Admin_Id(int stu_Admin_Id) {
		this.stu_Admin_Id = stu_Admin_Id;
	}

	public Student_Details getStu_Admin_Stu_Details() {
		return stu_Admin_Stu_Details;
	}

	public void setStu_Admin_Stu_Details(Student_Details stu_Admin_Stu_Details) {
		this.stu_Admin_Stu_Details = stu_Admin_Stu_Details;
	}

	public ExamList getStu_Admin_Exam_List() {
		return stu_Admin_Exam_List;
	}

	public void setStu_Admin_Exam_List(ExamList stu_Admin_Exam_List) {
		this.stu_Admin_Exam_List = stu_Admin_Exam_List;
	}

	public float getStu_Admin_Book_Fee() {
		return stu_Admin_Book_Fee;
	}

	public void setStu_Admin_Book_Fee(float stu_Admin_Book_Fee) {
		this.stu_Admin_Book_Fee = stu_Admin_Book_Fee;
	}

	public float getStu_Admin_Transport_Fee() {
		return stu_Admin_Transport_Fee;
	}

	public void setStu_Admin_Transport_Fee(float stu_Admin_Transport_Fee) {
		this.stu_Admin_Transport_Fee = stu_Admin_Transport_Fee;
	}

	public float getStu_Admin_Exam_Fee() {
		return stu_Admin_Exam_Fee;
	}

	public void setStu_Admin_Exam_Fee(float stu_Admin_Exam_Fee) {
		this.stu_Admin_Exam_Fee = stu_Admin_Exam_Fee;
	}

	public float getStu_Admin_Fine_Fee() {
		return stu_Admin_Fine_Fee;
	}

	public void setStu_Admin_Fine_Fee(float stu_Admin_Fine_Fee) {
		this.stu_Admin_Fine_Fee = stu_Admin_Fine_Fee;
	}

	public Date getStu_Admin_Created_Date() {
		return stu_Admin_Created_Date;
	}

	public void setStu_Admin_Created_Date(Date stu_Admin_Created_Date) {
		this.stu_Admin_Created_Date = stu_Admin_Created_Date;
	}

	public Date getStu_Admin_Updated_Date() {
		return stu_Admin_Updated_Date;
	}

	public void setStu_Admin_Updated_Date(Date stu_Admin_Updated_Date) {
		this.stu_Admin_Updated_Date = stu_Admin_Updated_Date;
	}

}
