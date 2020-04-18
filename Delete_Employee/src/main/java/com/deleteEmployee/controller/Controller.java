package com.deleteEmployee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deleteEmployee.globalException.Id_NotFound_Exception;
import com.deleteEmployee.service.Employee_ServiceI;

@RestController
@RequestMapping("/DeleteEmployee")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private Employee_ServiceI service;
	
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer empId) throws Id_NotFound_Exception
	{
		ResponseEntity<String> rs =  new ResponseEntity<String>(service.deleteEmployee(empId),HttpStatus.OK);
		return rs;
	}
	
	
}
