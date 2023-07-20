package com.example.employeerecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeerecords.endities.*;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long>{
    
}
