package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.DesignationDto;
import com.sampleProject.EmployeeManagementSystem.entity.Designation;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.services.DesignationService;
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
public class DesignationController
{
    @Autowired
    DesignationService designationService;

    @PostMapping("/addDesignation")
    public ResponseEntity<Designation> addDesignation(@RequestBody DesignationDto designationDto)
    {
        return new ResponseEntity<>(designationService.addDesignation(designationDto) , CREATED);
    }
    @GetMapping("/getAllDesignation")
    public ResponseEntity<List<Designation>> getAllDesignation()
    {
        return new ResponseEntity<>(designationService.getAllDesignation(), HttpStatus.FOUND);
    }
}
