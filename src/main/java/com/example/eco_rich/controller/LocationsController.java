package com.example.eco_rich.controller;

import com.example.eco_rich.domain.entity.Locations;
import com.example.eco_rich.dto.locations.LocationsResponseDTO;
import com.example.eco_rich.service.LocationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/locations")
@RequiredArgsConstructor
public class LocationsController {
    private final LocationsService locationsService;

    @GetMapping("/{locationId}")
    public LocationsResponseDTO getLocations(@PathVariable Long locationId) {
        Optional<Locations> one = Optional.ofNullable(locationsService.findOne(locationId));
        if (one.isPresent()) {
            Locations locations = one.get();
            return LocationsResponseDTO.of(
                    locations.getId(),
                    locations.getStreetAddress(),
                    locations.getPostalCode(),
                    locations.getCity(),
                    locations.getStateProvince(),
                    locations.getCountry().getId(),
                    locations.getCountry().getCountryName()
            );
        }
        return null;
    }
}
