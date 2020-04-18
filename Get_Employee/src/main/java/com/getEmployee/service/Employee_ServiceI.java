package com.getEmployee.service;

import com.getEmployee.entity.EmployeeDetails;
import com.getEmployee.globalException.Id_NotFound_Exception;

public interface Employee_ServiceI {

	EmployeeDetails getEmployeeDetails(Integer empId) throws Id_NotFound_Exception;

}

