package com.andyiot.employeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andyiot.employeeManagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

