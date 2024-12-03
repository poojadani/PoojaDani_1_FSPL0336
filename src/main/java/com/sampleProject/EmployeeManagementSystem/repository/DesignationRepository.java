package com.sampleProject.EmployeeManagementSystem.repository;

import com.sampleProject.EmployeeManagementSystem.entity.Designation;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository  extends JpaRepository<Designation,Long> {
}
