package com.example.eco_rich.repository;

import com.example.eco_rich.domain.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, Long> {
}
