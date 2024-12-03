package com.sampleProject.EmployeeManagementSystem.services;

import com.sampleProject.EmployeeManagementSystem.dto.DepartmentDto;
import com.sampleProject.EmployeeManagementSystem.dto.DesignationDto;
import com.sampleProject.EmployeeManagementSystem.entity.Department;
import com.sampleProject.EmployeeManagementSystem.entity.Designation;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.repository.DepartmentRepository;
import com.sampleProject.EmployeeManagementSystem.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DesignationService
{
    @Autowired
    DesignationRepository designationRepository;

    public Designation addDesignation(DesignationDto designationDto) {
        Designation designation =new Designation();
        designation.setDesignationId(0);
        designation.setDesignationName(designationDto.getDesignationName());


        designation.setCreatedBy(designationDto.getCreatedBy());
        designation.setCreatedDate(LocalDateTime.now());
        designation.setUpdatedBy(designationDto.getUpdatedBy());
        designation.setUpdatedDate(LocalDateTime.now());
        return designationRepository.save(designation);
    }

    public List<Designation> getAllDesignation()
    {
        List<Designation> list = designationRepository.findAll();
        return list;
    }
}
