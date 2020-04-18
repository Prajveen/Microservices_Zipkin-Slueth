package com.createEmployee.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createEmployee.dao.EmployeeRepository;
import com.createEmployee.entity.EmployeeDetails;
@Service
@Transactional
public class Employee_Service implements Employee_ServiceI{

	@Autowired
	private EmployeeRepository dao;
	@Override
	public EmployeeDetails createEmployee(EmployeeDetails employee)  {
		return dao.save(employee) ;	
	}
	
	

}
