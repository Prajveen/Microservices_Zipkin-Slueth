package com.fetchAll_Employees.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fetchAll_Employees.dao.EmployeeRepository;
import com.fetchAll_Employees.entity.EmployeeDetails;
@Service
@Transactional
public class Employee_Service implements Employee_ServiceI{

	@Autowired
	private EmployeeRepository dao;
	

	@Override
	public List<EmployeeDetails> fetchAllEmployees() {
		return  dao.findAll();

	}

	

}
