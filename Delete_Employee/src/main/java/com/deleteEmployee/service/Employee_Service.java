package com.deleteEmployee.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deleteEmployee.dao.EmployeeRepository;
@Service
@Transactional
public class Employee_Service implements Employee_ServiceI{

	@Autowired
	private EmployeeRepository dao;

	@Override
	public String deleteEmployee(Integer empId)   {
		dao.delete(empId);
		return "Deleted Successfully";
	}


}
