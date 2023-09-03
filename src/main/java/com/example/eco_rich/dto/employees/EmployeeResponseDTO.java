package com.example.eco_rich.dto.employees;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EmployeeResponseDTO {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDateTime hireDate;
    private String jobId;
    private Long salary;
    private Long commissionPct;
    private Long managerId;
    private Long departmentId;
    private String jobTitle;
    private Long minSalary;
    private Long maxSalary;
    private Long regionId;
    private String regionName;

    @Builder
    public EmployeeResponseDTO(Long employeeId, String firstName, String lastName, String email, String phoneNumber, LocalDateTime hireDate, String jobId, Long salary, Long commissionPct, Long managerId, Long departmentId, String jobTitle, Long minSalary, Long maxSalary, Long regionId, String regionName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.salary = salary;
        this.commissionPct = commissionPct;
        this.managerId = managerId;
        this.departmentId = departmentId;
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.regionId = regionId;
        this.regionName = regionName;
    }

    public static EmployeeResponseDTO of(Long employeeId, String firstName, String lastName, String email, String phoneNumber, LocalDateTime hireDate, String jobId, Long salary, Long commissionPct, Long managerId, Long departmentId, String jobTitle, Long minSalary, Long maxSalary, Long regionId, String regionName) {
        return EmployeeResponseDTO.builder()
                .employeeId(employeeId)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .phoneNumber(phoneNumber)
                .hireDate(hireDate)
                .jobId(jobId)
                .salary(salary)
                .commissionPct(commissionPct)
                .managerId(managerId)
                .departmentId(departmentId)
                .jobTitle(jobTitle)
                .minSalary(minSalary)
                .maxSalary(maxSalary)
                .regionId(regionId)
                .regionName(regionName)
                .build();
    }
}
