package com.example.eco_rich.dto.employees;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EmployeeHistoryResponseDTO {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String jobId;
    private Long salary;
    private Long commissionPct;
    private Long managerId;
    private Long departmentId;
    private String jobTitle;
    private LocalDateTime startDate;
    private LocalDateTime endDate;


}
