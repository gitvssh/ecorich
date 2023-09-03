package com.example.eco_rich.repository;

import com.example.eco_rich.domain.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Jobs, Long> {
}
