package com.school.daointerface;

import java.util.List;

import com.school.bean.Job_Role;

public interface JobRoleDao {
	public boolean addJobRole(Job_Role jobRole);

	public boolean updateJobRole(Job_Role jobRole);

	public Job_Role findJobRoleById(int jobId);

	public List<Job_Role> findAllJobRoles();
	
	public boolean updateAllJobRole(Job_Role newJobRole,Job_Role existJobRole);
}
