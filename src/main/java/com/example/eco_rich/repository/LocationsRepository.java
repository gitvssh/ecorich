package com.example.eco_rich.repository;

import com.example.eco_rich.domain.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationsRepository extends JpaRepository<Locations, Long> {
}
