package com.school.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Graduate_List")
public class Graduate_List {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Graduate_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int graduate_Id;

	@Column(name = "clm_Graduate_Name", columnDefinition = "varchar(50) default null")
	private String graduate_Name;

	@Column(name = "clm_Graduate_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date graduate_Created_Date;

	@Column(name = "clm_Graduate_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date graduate_Updated_Date;

	@Column(name = "clm_Graduate_Active", columnDefinition = "bit(1) default 0")
	private boolean graduate_Is_Active;

	public int getGraduate_Id() {
		return graduate_Id;
	}

	public void setGraduate_Id(int graduate_Id) {
		this.graduate_Id = graduate_Id;
	}

	public String getGraduate_Name() {
		return graduate_Name;
	}

	public void setGraduate_Name(String graduate_Name) {
		this.graduate_Name = graduate_Name;
	}

	public Date getGraduate_Created_Date() {
		return graduate_Created_Date;
	}

	public void setGraduate_Created_Date(Date graduate_Created_Date) {
		this.graduate_Created_Date = graduate_Created_Date;
	}

	public Date getGraduate_Updated_Date() {
		return graduate_Updated_Date;
	}

	public void setGraduate_Updated_Date(Date graduate_Updated_Date) {
		this.graduate_Updated_Date = graduate_Updated_Date;
	}

	public boolean isGraduate_Is_Active() {
		return graduate_Is_Active;
	}

	public void setGraduate_Is_Active(boolean graduate_Is_Active) {
		this.graduate_Is_Active = graduate_Is_Active;
	}

}
