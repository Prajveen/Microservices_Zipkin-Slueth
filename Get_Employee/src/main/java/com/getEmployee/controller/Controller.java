package com.getEmployee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getEmployee.entity.EmployeeDetails;
import com.getEmployee.globalException.Id_NotFound_Exception;
import com.getEmployee.service.Employee_ServiceI;

@RestController
@RequestMapping("/GetEmployee")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private Employee_ServiceI service;

	@GetMapping("/findById/{empId}")
	public EmployeeDetails getEmployeeDetails(@PathVariable Integer empId) throws Id_NotFound_Exception {
		EmployeeDetails result=service.getEmployeeDetails(empId);
		if(result== null)
		{
			throw new Id_NotFound_Exception("Employee with "+empId+" doesn't exist....!");
		}
		else
		{
			return result;
		}
	}

}
