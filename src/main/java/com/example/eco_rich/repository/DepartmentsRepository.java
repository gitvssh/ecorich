package com.example.eco_rich.repository;

import com.example.eco_rich.domain.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments, Long> {
}
