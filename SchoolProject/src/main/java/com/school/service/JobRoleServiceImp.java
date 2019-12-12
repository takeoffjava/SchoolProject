package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.Job_Role;
import com.school.daointerface.JobRoleDao;
import com.school.serviceinterface.JobRoleService;

@Service
public class JobRoleServiceImp implements JobRoleService {
	@Autowired
	JobRoleDao jobRoleDao;

	@Override
	public boolean addJobRole(Job_Role jobRole) {

		return jobRoleDao.addJobRole(jobRole);
	}

	@Override
	public boolean updateJobRole(Job_Role jobRole) {

		return jobRoleDao.updateJobRole(jobRole);
	}

	@Override
	public Job_Role findJobRoleById(int jobId) {

		return jobRoleDao.findJobRoleById(jobId);

	}

	@Override
	public List<Job_Role> findAllJobRoles() {

		return jobRoleDao.findAllJobRoles();
	}

	@Override
	public boolean updateAllJobRole(Job_Role newJobRole, Job_Role ExistJobRole) {

		if (newJobRole.getJob_Name() != null) {
			ExistJobRole.setJob_Name(newJobRole.getJob_Name());
		}
		if (newJobRole.isIs_Active() != ExistJobRole.isIs_Active())
			ExistJobRole.setIs_Active(newJobRole.isIs_Active());
		/*
		 * Date updatedDate = (Date) UtilSection.getInstance().getDateandTime();
		 * ExistJobRole.setJob_Updated_Date(updatedDate);
		 */
		return jobRoleDao.updateAllJobRole(newJobRole, ExistJobRole);
	}
}
