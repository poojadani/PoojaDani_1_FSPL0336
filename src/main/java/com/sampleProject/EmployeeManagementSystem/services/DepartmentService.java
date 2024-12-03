package com.sampleProject.EmployeeManagementSystem.services;

import com.sampleProject.EmployeeManagementSystem.dto.DepartmentDto;
import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeManagementSystem.entity.Department;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.repository.DepartmentRepository;
import com.sampleProject.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department addDepartment(DepartmentDto departmentDto) {
        Department dept =new Department();
        dept.setDeptId(0);
        dept.setDeptName(departmentDto.getDeptName());


        dept.setCreatedBy(departmentDto.getCreatedBy());
        dept.setCreatedDate(LocalDateTime.now());
        dept.setUpdatedBy(departmentDto.getUpdatedBy());
        dept.setUpdatedDate(LocalDateTime.now());
        return departmentRepository.save(dept);
    }

    public List<Department> getAllDept()
    {
        List<Department> list = departmentRepository.findAll();
        return list;
    }
}
