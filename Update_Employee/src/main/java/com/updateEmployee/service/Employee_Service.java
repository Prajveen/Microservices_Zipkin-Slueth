package com.updateEmployee.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.updateEmployee.dao.EmployeeRepository;
import com.updateEmployee.entity.EmployeeDetails;
@Service
@Transactional
public class Employee_Service implements Employee_ServiceI{

	@Autowired
	private EmployeeRepository dao;
	

	@Override
	public String updateEmployee(EmployeeDetails employee) {
		boolean result=dao.exists(employee.getEmployeeID());
		if(result)
		{
			dao.save(employee);
			return "Updated Successfully";
		}else
		{
			dao.save(employee);
			return "Update not possible user added ";
		}
	}


}
