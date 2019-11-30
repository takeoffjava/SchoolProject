package com.school.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Subject_List")
public class Subject_List {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clm_Sub_Id", columnDefinition = "bigint(10) unsigned not null", nullable = false)
	private int sub_Id;

	@Column(name = "clm_Sub_Name", columnDefinition = "varchar(50) default null")
	private String sub_Name;

	@Column(name = "clm_Sub_Created_Date", columnDefinition = "timestamp default now()", nullable = true)
	private Date sub_Created_Date;

	@Column(name = "clm_Sub_Updated_Date", columnDefinition = "timestamp null default null", nullable = true)
	private Date sub_Updated_Date;

	@Column(name = "clm_Sub_Active", columnDefinition = "bit(1) default 0")
	private boolean sub_Is_Active;

	public int getSub_Id() {
		return sub_Id;
	}

	public void setSub_Id(int sub_Id) {
		this.sub_Id = sub_Id;
	}

	public String getSub_Name() {
		return sub_Name;
	}

	public void setSub_Name(String sub_Name) {
		this.sub_Name = sub_Name;
	}

	public Date getSub_Created_Date() {
		return sub_Created_Date;
	}

	public void setSub_Created_Date(Date sub_Created_Date) {
		this.sub_Created_Date = sub_Created_Date;
	}

	public Date getSub_Updated_Date() {
		return sub_Updated_Date;
	}

	public void setSub_Updated_Date(Date sub_Updated_Date) {
		this.sub_Updated_Date = sub_Updated_Date;
	}

	public boolean isSub_Is_Active() {
		return sub_Is_Active;
	}

	public void setSub_Is_Active(boolean sub_Is_Active) {
		this.sub_Is_Active = sub_Is_Active;
	}

}
