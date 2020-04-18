package com.deleteEmployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deleteEmployee.entity.EmployeeDetails;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {


}
