package com.sampleProject.EmployeeManagementSystem.controller;
import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class EmployeeController
{
    @Autowired
    EmployeeService employeeservice;

    @PostMapping("/addData")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(employeeservice.addEmployee(employeeDto) , CREATED);
    }
}
