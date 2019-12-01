package com.school.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TBL_Job_Role")
public class Job_Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Job_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int job_Id;

	@Column(name = "clm_Job_Name", columnDefinition = "varchar(50) default null")
	private String job_Name;

	@Column(name = "clm_Job_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date job_Created_Date;

	@Column(name = "clm_Job_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date job_Updated_Date;

	@Column(name = "clm_Job_Active", columnDefinition = "bit(1) default 0")
	private boolean is_Active;

	public int getJob_Id() {
		return job_Id;
	}

	public void setJob_Id(int job_Id) {
		this.job_Id = job_Id;
	}

	public String getJob_Name() {
		return job_Name;
	}

	public void setJob_Name(String job_Name) {
		this.job_Name = job_Name;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss", locale = "IN")
	public Date getJob_Created_Date() {
		return job_Created_Date;
	}

	public void setJob_Created_Date(Date job_Created_Date) {
		this.job_Created_Date = job_Created_Date;
	}

	// @JsonIgnore
	public Date getJob_Updated_Date() {
		return job_Updated_Date;
	}

	public void setJob_Updated_Date(Date job_Updated_Date) {
		this.job_Updated_Date = job_Updated_Date;
	}

	public boolean isIs_Active() {
		return is_Active;
	}

	public void setIs_Active(boolean is_Active) {
		this.is_Active = is_Active;
	}

}
