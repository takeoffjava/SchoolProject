package com.school.serviceinterface;

import java.util.List;

import com.school.bean.Class_List;

public interface ClassService {
	public boolean addClass(Class_List classList);

	public boolean updateClass(Class_List classList);

	public boolean updateAllClass(Class_List newclassList, Class_List existclassList);

	public Class_List findClassById(int jobId);

	public List<Class_List> findAllClass();
}
