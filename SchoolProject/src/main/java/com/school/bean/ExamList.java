package com.school.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Exam_List")
public class ExamList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Exam_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int exam_Id;

	@Column(name = "clm_Exam_Name", columnDefinition = "varchar(50) default null")
	private String exam_Name;

	@Column(name = "clm_Exam_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date exam_Created_Date;

	@Column(name = "clm_Exam_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date exam_Updated_Date;

	@Column(name = "clm_Exam_Active", columnDefinition = "bit(1) default 0")
	private boolean exam_Is_Active;

	public int getExam_Id() {
		return exam_Id;
	}

	public void setExam_Id(int exam_Id) {
		this.exam_Id = exam_Id;
	}

	public String getExam_Name() {
		return exam_Name;
	}

	public void setExam_Name(String exam_Name) {
		this.exam_Name = exam_Name;
	}

	public Date getExam_Created_Date() {
		return exam_Created_Date;
	}

	public void setExam_Created_Date(Date exam_Created_Date) {
		this.exam_Created_Date = exam_Created_Date;
	}

	public Date getExam_Updated_Date() {
		return exam_Updated_Date;
	}

	public void setExam_Updated_Date(Date exam_Updated_Date) {
		this.exam_Updated_Date = exam_Updated_Date;
	}

	public boolean isExam_Is_Active() {
		return exam_Is_Active;
	}

	public void setExam_Is_Active(boolean exam_Is_Active) {
		this.exam_Is_Active = exam_Is_Active;
	}

}
