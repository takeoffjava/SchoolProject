package com.school.daointerface;

import java.util.List;

import com.school.bean.Class_List;

public interface ClassListDao {
	public boolean addClass(Class_List classList);

	public boolean updateClass(Class_List classList);

	public Class_List findClassById(int classId);

	public List<Class_List> findAllClassList();

	public boolean updateAllClass(Class_List newclass_List, Class_List existclass_List);
}
