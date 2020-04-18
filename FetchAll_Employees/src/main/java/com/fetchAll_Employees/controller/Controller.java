package com.fetchAll_Employees.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fetchAll_Employees.entity.EmployeeDetails;
import com.fetchAll_Employees.service.Employee_ServiceI;

@RestController
@RequestMapping("/FetchAll_employees")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private Employee_ServiceI service;
	
	
	
	
	
	@GetMapping("/fetchall")
	public List<EmployeeDetails> fetchAllEmployees() {
		return service.fetchAllEmployees();
	}
	
	
}
