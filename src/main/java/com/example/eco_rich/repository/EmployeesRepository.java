package com.example.eco_rich.repository;

import com.example.eco_rich.domain.entity.Employees;
import com.example.eco_rich.domain.entity.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    @Query("SELECT jh FROM JobHistory jh WHERE jh.id.employeeId = :employeeId")
    List<JobHistory> findJobHistoryByEmployeeId(@Param("employeeId") Long employeeId);

}
