package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.Class_List;
import com.school.bean.Job_Role;
import com.school.daointerface.ClassListDao;
import com.school.serviceinterface.ClassService;

@Service
public class ClassServiceImp implements ClassService {
	@Autowired
	ClassListDao classlistDao;

	@Override
	public boolean addClass(Class_List classList) {

		return classlistDao.addClass(classList);
	}

	@Override
	public boolean updateClass(Class_List classList) {

		return classlistDao.updateClass(classList);
	}

	@Override
	public Class_List findClassById(int classId) {

		return classlistDao.findClassById(classId);

	}

	@Override
	public List<Class_List> findAllClass() {

		return classlistDao.findAllClassList();
	}

	@Override
	public boolean updateAllClass(Class_List newclassList, Class_List existclassList) {

		if (newclassList.getClass_Name() != null) {
			existclassList.setClass_Name(newclassList.getClass_Name());
		}
		if (newclassList.isClass_Is_Active() != existclassList.isClass_Is_Active())
			existclassList.setClass_Is_Active(newclassList.isClass_Is_Active());
		return classlistDao.updateAllClass(newclassList, existclassList);
	}

}
