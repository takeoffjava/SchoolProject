package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.Job_Role;
import com.school.daointerface.JobRoleDao;
import com.school.serviceinterface.JobRoleService;

@Service
public class JobRoleServiceImp implements JobRoleService {
	@Autowired
	JobRoleDao jobRoleDao;

	public boolean addJobRole(Job_Role jobRole) {
		
		return jobRoleDao.addJobRole(jobRole);
	}

}
