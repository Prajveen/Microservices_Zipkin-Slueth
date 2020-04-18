package com.createEmployee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createEmployee.entity.EmployeeDetails;
import com.createEmployee.service.Employee_ServiceI;

@RestController
@RequestMapping("/Create_Employee")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private Employee_ServiceI service;
	
	@SuppressWarnings("unused")
	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeDetails employee){
		
		EmployeeDetails emp = service.createEmployee(employee);
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Employee created successfully",HttpStatus.OK);
		return responseEntity;
		
	}
	}
