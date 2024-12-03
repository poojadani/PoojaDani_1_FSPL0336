package com.sampleProject.EmployeeManagementSystem.services;

import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee =new Employee();
        employee.setEmployeeId(0L);
        employee.setEmployeeName(employeeDto.getEmployeeName());
        employee.setEmail(employeeDto.getEmail());
        employee.setSal(employeeDto.getSal());

        employee.setCreatedBy(employeeDto.getCreatedBy());
        employee.setCreatedDate(LocalDateTime.now());
        employee.setUpdatedBy(employeeDto.getUpdatedBy());
        employee.setUpdatedDate(LocalDateTime.now());
        return employeeRepository.save(employee);
    }
}