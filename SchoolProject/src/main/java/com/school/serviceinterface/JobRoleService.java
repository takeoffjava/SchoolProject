package com.school.serviceinterface;

import java.util.List;

import com.school.bean.Job_Role;

public interface JobRoleService {
	public boolean addJobRole(Job_Role jobRole);

	public boolean updateJobRole(Job_Role jobRole);

	public boolean updateAllJobRole(Job_Role newJobRole, Job_Role existJobRole);

	public Job_Role findJobRoleById(int jobId);

	public List<Job_Role> findAllJobRoles();
}
