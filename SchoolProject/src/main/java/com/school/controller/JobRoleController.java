package com.school.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.school.bean.Job_Role;
import com.school.serviceinterface.JobRoleService;
import com.school.util.JsonConvertor;

@RestController
@RequestMapping("/C_Job_Role")
public class JobRoleController {

	@Autowired
	JobRoleService jobRoleService;

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public Map<String, Integer> call() {
		System.out.println("Fetching User with id ");
		Map<String, Integer> response = new HashMap<String, Integer>();
		return response;
	}

	@RequestMapping(value = "/addJobRole", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Job_Role> insertJobTyps(@RequestBody Job_Role jobRole) {
		//Job_Role jobRole = JsonConvertor.convertJSON2EntityClass(JSONContentofPOST, Job_Role.class);
		if (jobRoleService.addJobRole(jobRole))
			return new ResponseEntity<Job_Role>(HttpStatus.CREATED);
		else
			return new ResponseEntity<Job_Role>(jobRole, HttpStatus.METHOD_FAILURE);
	}

	@PutMapping(value = "/updateJobRole", headers = "Accept=application/json")
	public ResponseEntity<String> updateJobRole(@RequestBody String jobReqRole) {
		Job_Role requestJobRoleObject = JsonConvertor.convertJSON2EntityClass(jobReqRole, Job_Role.class);
		Job_Role jobRole = jobRoleService.findJobRoleById(requestJobRoleObject.getJob_Id());
		if (jobRole == null) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		if (jobRoleService.updateJobRole(requestJobRoleObject)) {
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(HttpStatus.METHOD_FAILURE);

	}

	@GetMapping(value = "/{jobId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Job_Role> getJobRoleById(@PathVariable("jobId") int jobId) {
		Job_Role jobRole = jobRoleService.findJobRoleById(jobId);
		if (jobRole == null) {
			return new ResponseEntity<Job_Role>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Job_Role>(jobRole, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllJobRoles", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Job_Role>> getAllJobRoll() {
		List<Job_Role> jobRoleList = jobRoleService.findAllJobRoles();
		if (jobRoleList == null || jobRoleList.isEmpty()) {
			return new ResponseEntity<List<Job_Role>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Job_Role>>(jobRoleList, HttpStatus.OK);
	}

	@PutMapping(value = "/updateAllJobRole", headers = "Accept=application/json") // Hibernate Merge Example
	public ResponseEntity<String> updateAllJobRole(@RequestBody String jobReqRole) {
		Job_Role requestJobRoleObject = JsonConvertor.convertJSON2EntityClass(jobReqRole, Job_Role.class);
		Job_Role jobRole = jobRoleService.findJobRoleById(requestJobRoleObject.getJob_Id());
		if (jobRole == null) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		if (jobRoleService.updateAllJobRole(requestJobRoleObject, jobRole)) {
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(HttpStatus.METHOD_FAILURE);

	}

}
