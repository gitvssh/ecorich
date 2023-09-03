package com.example.eco_rich.service;

import com.example.eco_rich.domain.entity.Employees;
import com.example.eco_rich.domain.entity.JobHistory;
import com.example.eco_rich.repository.EmployeesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EmployeesService {
    private final EmployeesRepository employeesRepository;

    public Optional<Employees> findOne(Long employeeId) {
        return employeesRepository.findById(employeeId);
    }

    public List<JobHistory> findOneHistory(Long employeeId) {
        return employeesRepository.findJobHistoryByEmployeeId(employeeId);
    }
}
