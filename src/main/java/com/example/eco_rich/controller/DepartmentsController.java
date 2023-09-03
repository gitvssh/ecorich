package com.example.eco_rich.controller;

import com.example.eco_rich.domain.entity.Departments;
import com.example.eco_rich.dto.departments.DepartmentsResponseDTO;
import com.example.eco_rich.service.DepartmentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentsController {
    private final DepartmentsService departmentsService;

    @GetMapping("/{departmentId}")
    public DepartmentsResponseDTO getDepartments(@PathVariable Long departmentId) {
        Optional<Departments> one = Optional.ofNullable(departmentsService.findOne(departmentId));
        if (one.isPresent()) {
            Departments departments = one.get();
            return DepartmentsResponseDTO.of(
                    departments.getId(),
                    departments.getDepartmentName(),
                    departments.getManager().getId(),
                    departments.getLocation().getId(),
                    departments.getManager().getFirstName() + " " + departments.getManager().getLastName(),
                    departments.getLocation().getCity() + " " + departments.getLocation().getCountry().getCountryName()
            );
        }
        return null;
    }
}
