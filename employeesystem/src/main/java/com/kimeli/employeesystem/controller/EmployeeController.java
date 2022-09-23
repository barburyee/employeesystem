package com.kimeli.employeesystem.controller;

import com.kimeli.employeesystem.model.Employee;
import com.kimeli.employeesystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    //get all employees
    @GetMapping("getAll")
    public List<Employee>getAllEmployees(){
        return employeeRepository.findAll();
    }
}
