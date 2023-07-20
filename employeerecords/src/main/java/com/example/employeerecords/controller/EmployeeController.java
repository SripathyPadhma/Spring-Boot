package com.example.employeerecords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.employeerecords.services.EmployeeService;
import com.example.employeerecords.endities.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService emp;

    @GetMapping("/")
    public String viewHomePage(Model m)
    {
        m.addAttribute("listEmployees", emp.getAllEmployees());
        return "index.html";
    }
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model m)
    {
        Employee e=new Employee();
        m.addAttribute("employee", e);
        return "newemployee.html";

    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee)
    {
        emp.saveEmployee(employee);
        return "redirect:/";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value="id") long id,Model m)
    {
            Employee e=emp.getEmployeeId(id);
            m.addAttribute("employee", e);
            return "updateEmployee.html";
    }
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value="id")long id)
    {
        this.emp.deleteEmployeeById(id);
        return "redirect:/";
    }
    
}
