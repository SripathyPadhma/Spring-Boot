package com.example.employeerecords.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.employeerecords.endities.*;
import com.example.employeerecords.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;
    public List<Employee> getAllEmployees()
    {
            return repository.findAll();
    }

    public void saveEmployee(Employee e)
    {
        this.repository.save(e);
    }
    public Employee getEmployeeId(long id)
    {
        Optional<Employee> opt=repository.findById(id);
        Employee e=null;
        if(opt.isPresent())
        {
            e=opt.get();
        }
        else
        {
            throw new RuntimeException("Employee records not found for id"+id);
        }
        return e;
    }
    public void deleteEmployeeById(long id)
    {
        this.repository.deleteById(id);
    }
    
}
