package com.sampleProject.EmployeeManagementSystem.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class DepartmentDto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // private int deptId;
    private String deptName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
