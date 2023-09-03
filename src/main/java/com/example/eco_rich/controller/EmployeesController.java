package com.example.eco_rich.controller;

import com.example.eco_rich.domain.entity.Employees;
import com.example.eco_rich.domain.entity.JobHistory;
import com.example.eco_rich.dto.employees.EmployeeHistoryResponseDTO;
import com.example.eco_rich.dto.employees.EmployeeResponseDTO;
import com.example.eco_rich.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeesController {
    private final EmployeesService employeesService;


    @GetMapping("/{employeeId}")
    public EmployeeResponseDTO getEmployees(@PathVariable Long employeeId) {
        Optional<Employees> one = employeesService.findOne(employeeId);
        if (one.isPresent()) {
            Employees employees = one.get();
            Long mgrId = (employees.getManager() != null) ? employees.getManager().getId() : null;

            return EmployeeResponseDTO.of(
                    employees.getId(),
                    employees.getFirstName(),
                    employees.getLastName(),
                    employees.getEmail(),
                    employees.getPhoneNumber(),
                    employees.getHireDate(),
                    employees.getJob().getId(),
                    employees.getSalary(),
                    employees.getCommissionPct(),
                    mgrId,
                    employees.getDepartment().getId(),
                    employees.getJob().getJobTitle(),
                    employees.getJob().getMinSalary(),
                    employees.getJob().getMaxSalary(),
                    employees.getDepartment().getLocation().getCountry().getRegion().getId(),
                    employees.getDepartment().getLocation().getCountry().getRegion().getRegionName()
            );
        }
        return null;
    }

    @GetMapping("/{employeeId}/history")
    public EmployeeHistoryResponseDTO getEmployeesHistory(@PathVariable Long employeeId) {
        List<JobHistory> oneHistory = employeesService.findOneHistory(employeeId);
        if (oneHistory.size() > 0) {
            JobHistory jobHistory = oneHistory.get(0);
            return EmployeeHistoryResponseDTO.of(
                    jobHistory.getId().getEmployeeId(),
                    jobHistory.getEmployee().getFirstName(),
                    jobHistory.getEmployee().getLastName(),
                    jobHistory.getEmployee().getEmail(),
                    jobHistory.getEmployee().getPhoneNumber(),
                    jobHistory.getEmployee().getJob().getId(),
                    jobHistory.getEmployee().getSalary(),
                    jobHistory.getEmployee().getCommissionPct(),
                    jobHistory.getEmployee().getManager().getId(),
                    jobHistory.getEmployee().getDepartment().getId(),
                    jobHistory.getEmployee().getJob().getJobTitle(),
                    jobHistory.getStartDate(),
                    jobHistory.getEndDate()
            );
        }
        return null;
    }
}
