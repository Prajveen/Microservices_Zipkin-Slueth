package com.getEmployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getEmployee.entity.EmployeeDetails;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {


}
