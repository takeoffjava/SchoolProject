package com.school.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.school.bean.Job_Role;
import com.school.service.JobRoleServiceImp;
import com.school.util.JsonConvertor;

@RestController
@RequestMapping("/C_Job_Role")
public class JobRoleController {

	@Autowired
	JobRoleServiceImp jobRoleService;

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public Map<String, Integer> call() {
		System.out.println("Fetching User with id ");
		Map<String, Integer> response = new HashMap<String, Integer>();
		return response;
	}

	@RequestMapping(value = "/addJobRole", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Job_Role> insertusertyps(@RequestBody String JSONContentofPOST) {
		Job_Role jobRole = JsonConvertor.convertJSON2EntityClass(JSONContentofPOST, Job_Role.class);
		if (jobRoleService.addJobRole(jobRole))
			return new ResponseEntity<Job_Role>(HttpStatus.CREATED);
		else
			return new ResponseEntity<Job_Role>(jobRole, HttpStatus.METHOD_FAILURE);
	}

	/*
	 * @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	 * public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
	 * System.out.println("Fetching User with id " + id); User user =
	 * userService.findById(id); if (user == null) { return new
	 * ResponseEntity<User>(HttpStatus.NOT_FOUND); } return new
	 * ResponseEntity<User>(user, HttpStatus.OK); }
	 * 
	 * @PostMapping(value="/create",headers="Accept=application/json") public
	 * ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder
	 * ucBuilder){ System.out.println("Creating User "+user.getName());
	 * userService.createUser(user); HttpHeaders headers = new HttpHeaders();
	 * headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId())
	 * .toUri()); return new ResponseEntity<Void>(headers, HttpStatus.CREATED); }
	 * 
	 * @GetMapping(value="/get", headers="Accept=application/json") public
	 * List<User> getAllUser() { List<User> tasks=userService.getUser(); return
	 * tasks;
	 * 
	 * }
	 * 
	 * @PutMapping(value="/update", headers="Accept=application/json") public
	 * ResponseEntity<String> updateUser(@RequestBody User currentUser) {
	 * System.out.println("sd"); User user =
	 * userService.findById(currentUser.getId()); if (user==null) { return new
	 * ResponseEntity<String>(HttpStatus.NOT_FOUND); }
	 * userService.update(currentUser, currentUser.getId()); return new
	 * ResponseEntity<String>(HttpStatus.OK); }
	 * 
	 * @DeleteMapping(value="/{id}", headers ="Accept=application/json") public
	 * ResponseEntity<User> deleteUser(@PathVariable("id") int id){ User user =
	 * userService.findById(id); if (user == null) { return new
	 * ResponseEntity<User>(HttpStatus.NOT_FOUND); } userService.deleteUserById(id);
	 * return new ResponseEntity<User>(HttpStatus.NO_CONTENT); }
	 * 
	 * @PatchMapping(value="/{id}", headers="Accept=application/json") public
	 * ResponseEntity<User> updateUserPartially(@PathVariable("id") int
	 * id, @RequestBody User currentUser){ User user = userService.findById(id);
	 * if(user ==null){ return new ResponseEntity<User>(HttpStatus.NOT_FOUND); }
	 * User usr = userService.updatePartially(currentUser, id); return new
	 * ResponseEntity<User>(usr, HttpStatus.OK); }
	 */
}
