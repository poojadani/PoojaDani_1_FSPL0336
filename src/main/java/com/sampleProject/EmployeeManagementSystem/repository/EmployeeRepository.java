package com.sampleProject.EmployeeManagementSystem.repository;

import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}
