package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.DepartmentDto;
import com.sampleProject.EmployeeManagementSystem.entity.Department;
import com.sampleProject.EmployeeManagementSystem.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public ResponseEntity<Department> addDepartment(@RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentService.addDepartment(departmentDto) , CREATED);
    }
}
