package com.deleteEmployee.service;

import com.deleteEmployee.globalException.Id_NotFound_Exception;

public interface Employee_ServiceI {

	String deleteEmployee(Integer empId) throws  Id_NotFound_Exception;

}

