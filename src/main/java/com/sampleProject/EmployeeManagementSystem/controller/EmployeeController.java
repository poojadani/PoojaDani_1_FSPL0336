package com.sampleProject.EmployeeManagementSystem.controller;
import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class EmployeeController
{
    @Autowired
    EmployeeService employeeservice;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(employeeservice.addEmployee(employeeDto) , CREATED);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmployee()
    {
        return new ResponseEntity<>(employeeservice.getAllEmployee(),HttpStatus.FOUND);
    }

}
