package com.example.eco_rich.service;

import com.example.eco_rich.domain.entity.Locations;
import com.example.eco_rich.repository.LocationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationsService {
    private final LocationsRepository locationsRepository;

    public Locations findOne(Long locationId) {
        return locationsRepository.findById(locationId).orElse(null);
    }
}
