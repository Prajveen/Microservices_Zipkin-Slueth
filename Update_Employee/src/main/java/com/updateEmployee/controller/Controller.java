package com.updateEmployee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.updateEmployee.entity.EmployeeDetails;
import com.updateEmployee.globalException.Id_NotFound_Exception;
import com.updateEmployee.service.Employee_ServiceI;

@RestController
@RequestMapping("/Update_employee")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private Employee_ServiceI service;
	
	
	
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody EmployeeDetails employee) throws Id_NotFound_Exception {
		
		String Url="http://localhost:1414/GetEmployee/findById/"+employee.getEmployeeID();
		 RestTemplate restTemplate = new RestTemplate();
	     EmployeeDetails result = restTemplate.getForObject(Url, EmployeeDetails.class);
		if(result== null)
		{
			throw new Id_NotFound_Exception("Employee with "+employee.getEmployeeID()+" already exists....!");
		}
		else
		{
			ResponseEntity< String> details = new ResponseEntity<String>(service.updateEmployee(employee),HttpStatus.OK);
			return details;
		}
		
	}
	
	
}
