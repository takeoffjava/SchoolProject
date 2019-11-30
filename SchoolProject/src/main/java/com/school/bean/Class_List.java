package com.school.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Class_List")
public class Class_List {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Class_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int class_Id;

	@Column(name = "clm_Class_Name", columnDefinition = "varchar(50) default null")
	private String class_Name;

	@Column(name = "clm_Class_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date Class_Created_Date;

	@Column(name = "clm_Class_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date class_Updated_Date;

	@Column(name = "clm_Class_Active", columnDefinition = "bit(1) default 0")
	private boolean class_Is_Active;

	public int getClass_Id() {
		return class_Id;
	}

	public void setClass_Id(int class_Id) {
		this.class_Id = class_Id;
	}

	public String getClass_Name() {
		return class_Name;
	}

	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}

	public Date getClass_Created_Date() {
		return Class_Created_Date;
	}

	public void setClass_Created_Date(Date class_Created_Date) {
		Class_Created_Date = class_Created_Date;
	}

	public Date getClass_Updated_Date() {
		return class_Updated_Date;
	}

	public void setClass_Updated_Date(Date class_Updated_Date) {
		this.class_Updated_Date = class_Updated_Date;
	}

	public boolean isClass_Is_Active() {
		return class_Is_Active;
	}

	public void setClass_Is_Active(boolean class_Is_Active) {
		this.class_Is_Active = class_Is_Active;
	}

}
