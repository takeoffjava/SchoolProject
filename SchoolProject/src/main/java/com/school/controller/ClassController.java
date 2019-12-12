package com.school.controller;

import java.util.List;

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

import com.school.bean.Class_List;
import com.school.bean.Job_Role;
import com.school.serviceinterface.ClassService;
import com.school.util.JsonConvertor;

@RestController
@RequestMapping("/C_Class_List")
public class ClassController {

	@Autowired
	ClassService classService;

	@RequestMapping(value = "/addClassList", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Class_List> insertClass(@RequestBody Class_List class_List) {
		if (classService.addClass(class_List))
			return new ResponseEntity<Class_List>(HttpStatus.CREATED);
		else
			return new ResponseEntity<Class_List>(class_List, HttpStatus.METHOD_FAILURE);
	}

	@PutMapping(value = "/updateClassList", headers = "Accept=application/json")
	public ResponseEntity<String> updateClassList(@RequestBody Class_List class_List) {
		Class_List classList = classService.findClassById(class_List.getClass_Id());
		if (classList == null) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		if (classService.updateClass(class_List)) {
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(HttpStatus.METHOD_FAILURE);

	}

	@GetMapping(value = "/{classId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Class_List> getClassById(@PathVariable("classId") int classId) {
		Class_List classList = classService.findClassById(classId);
		if (classList == null) {
			return new ResponseEntity<Class_List>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Class_List>(classList, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllClassList", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Class_List>> getAllJobRoll() {
		List<Class_List> class_List = classService.findAllClass();
		if (class_List == null || class_List.isEmpty()) {
			return new ResponseEntity<List<Class_List>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Class_List>>(class_List, HttpStatus.OK);
	}

	@PutMapping(value = "/updateAllClassList", headers = "Accept=application/json") // Hibernate Merge Example
	public ResponseEntity<String> updateAllClassList(@RequestBody Class_List class_List) {
		Class_List class_List_Check = classService.findClassById(class_List.getClass_Id());
		if (class_List_Check == null) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		if (classService.updateAllClass(class_List, class_List_Check)) {
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(HttpStatus.METHOD_FAILURE);

	}
}
