package com.updateEmployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.updateEmployee.entity.EmployeeDetails;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {


}
