package com.example.eco_rich.service;

import com.example.eco_rich.domain.entity.Departments;
import com.example.eco_rich.repository.DepartmentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentsService {

    private final DepartmentsRepository departmentsRepository;

    public Departments findOne(Long departmentId) {
        return departmentsRepository.findById(departmentId).orElse(null);
    }
}
